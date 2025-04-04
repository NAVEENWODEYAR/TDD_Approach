package com.unit.mockito.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 04-Apr-2025
 */

@SpringBootTest
@EnableRetry
class WeatherServiceTest {

    @Autowired
    private WeatherService weatherService;  // The service under test

    @MockBean
    private RestTemplate restTemplate;  // Mock RestTemplate to avoid real API calls

    private String validCity = "London";
    private String invalidCity = "InvalidCity";

    @BeforeEach
    void setUp() {
        // Optional: Reset mocks or perform additional setup if needed.
    }

    @Test
    void testGetWeatherSuccess() {
        // Prepare mocked response from RestTemplate
        String mockWeatherResponse = "{ \"current\": { \"temperature\": 15 } }";
        ResponseEntity<Object> mockResponse = ResponseEntity.ok(mockWeatherResponse);

        // Mock the RestTemplate to return a successful response
        when(restTemplate.exchange(anyString(), eq(HttpMethod.GET), any(), eq(Object.class)))
                .thenReturn(mockResponse);

        // Call the service method
        Object result = weatherService.getWeather(validCity);

        // Verify that the response is what we mocked
        assertNotNull(result);
        assertTrue(result.toString().contains("temperature"));
        verify(restTemplate, times(1)).exchange(anyString(), eq(HttpMethod.GET), any(), eq(Object.class));
    }

    @Test
    void testGetWeatherRetriesOnFailure() {
        // Prepare mock to throw an exception twice and return a successful result on the third attempt
        when(restTemplate.exchange(anyString(), eq(HttpMethod.GET), any(), eq(Object.class)))
                .thenThrow(new RuntimeException("Temporary failure"))
                .thenThrow(new RuntimeException("Temporary failure"))
                .thenReturn(ResponseEntity.ok("{ \"current\": { \"temperature\": 15 } }"));

        // Call the service method
        Object result = weatherService.getWeather(validCity);

        // Verify that the retry mechanism works as expected
        assertNotNull(result);
        assertTrue(result.toString().contains("temperature"));
        verify(restTemplate, times(3)).exchange(anyString(), eq(HttpMethod.GET), any(), eq(Object.class));
    }

    @Test
    void testGetWeatherFailureAfterRetries() {
        // Prepare mock to always throw an exception (simulate failure even after retries)
        when(restTemplate.exchange(anyString(), eq(HttpMethod.GET), any(), eq(Object.class)))
                .thenThrow(new RuntimeException("Temporary failure"));

        // Call the service method and assert it throws an exception after retries
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
            weatherService.getWeather(invalidCity);
        });

        assertEquals("Temporary failure", thrown.getMessage());
        verify(restTemplate, times(3)).exchange(anyString(), eq(HttpMethod.GET), any(), eq(Object.class));
    }

    @Test
    void testGetWeatherInvalidCity() {
        // Here, we'll test the invalid city scenario where the weather API might not exist

        // Prepare mock to throw an exception for invalid city
        when(restTemplate.exchange(anyString(), eq(HttpMethod.GET), any(), eq(Object.class)))
                .thenThrow(new RuntimeException("City not found"));

        // Call the service method
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
            weatherService.getWeather(invalidCity);
        });

        assertEquals("City not found", thrown.getMessage());
        verify(restTemplate, times(1)).exchange(anyString(), eq(HttpMethod.GET), any(), eq(Object.class));
    }
}
