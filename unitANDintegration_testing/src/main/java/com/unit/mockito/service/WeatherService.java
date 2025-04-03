package com.unit.mockito.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */

@Service
public class WeatherService {

    private static final Logger log = LoggerFactory.getLogger(WeatherService.class);

    // API key,
    private String apiKey = "190a443a447df5f4dd0c10d2679a3c34";
    
    // Weather API,
    private static final String API = "https://api.weatherstack.com/current?access_key=API_KEY&query=CITY";
    
    @Autowired
    private RestTemplate restTemplate;

    /**
     * Retrieves weather information for a given city with retry mechanism.
     * @param city The name of the city for which weather is requested.
     * @return The weather data or null if it fails after retries.
     */
    @Retryable(
        value = {Exception.class},  // Specify which exceptions to retry for (you can make it more specific if needed)
        maxAttempts = 3,            // Maximum number of retry attempts
        backoff = @Backoff(delay = 2000, multiplier = 1.5)  // Delay of 2 seconds, with exponential backoff
    )
    public Object getWeather(String city) {
        try {
            String finalUrl = API.replace("CITY", city).replace("API_KEY", apiKey);
            log.debug(finalUrl);
            log.warn(city);
            
            // Make the request
            ResponseEntity<Object> weatherReport = restTemplate.exchange(finalUrl, HttpMethod.GET, null, Object.class);
            Object weatherResponse = weatherReport.getBody();
            return weatherResponse;

        } catch (Exception e) {
            // This exception will be retried as per the @Retryable annotation
            log.error("Failed to fetch weather data for city {}: {}", city, e.getMessage());
            throw e;  // Re-throw the exception to trigger retry
        }
    }
}
