package com.unit.mockito.entity;
/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */

public class WeatherResponse {

	public class Current{
	    public String observation_time;
	    public int temperature;
	    public int weather_code;
	    public ArrayList<String> weather_icons;
	    public ArrayList<String> weather_descriptions;
	    public int wind_speed;
	    public int wind_degree;
	    public String wind_dir;
	    public int pressure;
	    public int precip;
	    public int humidity;
	    public int cloudcover;
	    public int feelslike;
	    public int uv_index;
	    public int visibility;
	    public String is_day;
	}

	public class Location{
	    public String name;
	    public String country;
	    public String region;
	    public String lat;
	    public String lon;
	    public String timezone_id;
	    public String localtime;
	    public int localtime_epoch;
	    public String utc_offset;
	}

	public class Request{
	    public String type;
	    public String query;
	    public String language;
	    public String unit;
	}

	public class Root{
	    public Request request;
	    public Location location;
	    public Current current;
	}


}
