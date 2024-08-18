package com.unit.mockito.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Current {

		@JsonProperty("observation_time")
	    private String observationTime;
	    
	    private int temperature;
	    
	    @JsonProperty("weather_code")
	    private int weatherCode;
	    
	    @JsonProperty("weather_icons")
	    private ArrayList<String> weatherIcons;
	    
	    @JsonProperty("weather_descriptions")
	    private ArrayList<String> weatherDescriptions;
	    
	    @JsonProperty("wind_speed")
	    private int windSpeed;
	    
	    @JsonProperty("wind_degree")
	    private int windDegree;
	    
	    @JsonProperty("wind_dir")
	    private String wind_Dir;
	    
	    private int pressure;
	    
	    private int precip;
	    
	    private int humidity;
	    
	    private int cloudcover;
	    
	    private int feelslike;
	    
	    @JsonProperty("uv_index")
	    private int uvIndex;
	    
	    private int visibility;
	    
	    @JsonProperty("is_day")
	    private String isDay;

}
