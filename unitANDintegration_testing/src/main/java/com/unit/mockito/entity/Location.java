package com.unit.mockito.entity;

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
public class Location {

	    private String name;
	    
	    private String country;
	    
	    private String region;
	    
	    private String lat;
	    
	    private String lon;
	    
	    @JsonProperty("timezone_id")
	    private String timezoneId;
	    
	    private String localtime;
	    
	    private int localtime_epoch;
	    
	    @JsonProperty("utc_offset")
	    private String utcOffset;
	
}
