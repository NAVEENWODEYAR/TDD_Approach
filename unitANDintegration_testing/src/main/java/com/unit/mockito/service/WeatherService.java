package com.unit.mockito.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import lombok.extern.slf4j.Slf4j;

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
	
	public Object getWeather(String city) {
		try {
			String finalUrl = API.replace("CITY", city).replace("API_KEY", apiKey);
			log.debug(finalUrl);
			log.warn(city);
			ResponseEntity<Object> weatherReport = restTemplate.exchange(finalUrl, HttpMethod.GET,null,Object.class);
			Object weatherResponse = weatherReport.getBody();
			return weatherResponse;
		} catch (Exception e) {
			log.error("Exception occured: {}",e.getLocalizedMessage());
		}
		return null;
	}
	
}
