package com.unit.mockito.repo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */

public class WeatherResponses {

	    private Current current;

	    @Getter
	    @Setter
	    public class Current {
	        private int temperature;
	        @JsonProperty("weather_descriptions")
	        private List<String> weatherDescriptions;
	        private int feelslike;
	    }


}
