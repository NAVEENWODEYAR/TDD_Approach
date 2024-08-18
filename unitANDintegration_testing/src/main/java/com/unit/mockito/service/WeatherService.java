package com.unit.mockito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
@Service
public class WeatherService {

	private String apiKey = "190a443a447df5f4dd0c10d2679a3c34";
	
	private static final String API = "https://api.weatherstack.com/current?access_key=API_KEY&query=CITY";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String getWeaher(String city) {
		String finalUrl = API.replace("CITY", city).replace("API_KEY", apiKey) ;
		
		
	}
}
