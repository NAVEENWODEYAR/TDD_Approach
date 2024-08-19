package com.unit.mockito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.unit.mockito.entity.WeatherResponse;
import com.unit.mockito.repo.response.WeatherResponses;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
@Slf4j
@Service
public class WeatherService {

	private String apiKey = "190a443a447df5f4dd0c10d2679a3c34";
	
	private static final String API = "https://api.weatherstack.com/current?access_key=API_KEY&query=CITY";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Object getWeather(String city) {
		String finalUrl = API.replace("CITY", city).replace("API_KEY", apiKey);
		log.debug(finalUrl);
		log.warn(city);
		ResponseEntity<Object> weatherReport = restTemplate.exchange(finalUrl, HttpMethod.GET,null,Object.class);
		Object weatherResponse = weatherReport.getBody();
		return weatherResponse;
	}
	
}
