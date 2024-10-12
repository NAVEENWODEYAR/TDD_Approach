package com.unit.mockito.entity;

import java.util.ArrayList;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
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

	    public Current() {}

		public Current(String observationTime, int temperature, int weatherCode, ArrayList<String> weatherIcons,
				ArrayList<String> weatherDescriptions, int windSpeed, int windDegree, String wind_Dir, int pressure,
				int precip, int humidity, int cloudcover, int feelslike, int uvIndex, int visibility, String isDay) {
			super();
			this.observationTime = observationTime;
			this.temperature = temperature;
			this.weatherCode = weatherCode;
			this.weatherIcons = weatherIcons;
			this.weatherDescriptions = weatherDescriptions;
			this.windSpeed = windSpeed;
			this.windDegree = windDegree;
			this.wind_Dir = wind_Dir;
			this.pressure = pressure;
			this.precip = precip;
			this.humidity = humidity;
			this.cloudcover = cloudcover;
			this.feelslike = feelslike;
			this.uvIndex = uvIndex;
			this.visibility = visibility;
			this.isDay = isDay;
		}

		/**
		 * @return the observationTime
		 */
		public String getObservationTime() {
			return observationTime;
		}

		/**
		 * @param observationTime the observationTime to set
		 */
		public void setObservationTime(String observationTime) {
			this.observationTime = observationTime;
		}

		/**
		 * @return the temperature
		 */
		public int getTemperature() {
			return temperature;
		}

		/**
		 * @param temperature the temperature to set
		 */
		public void setTemperature(int temperature) {
			this.temperature = temperature;
		}

		/**
		 * @return the weatherCode
		 */
		public int getWeatherCode() {
			return weatherCode;
		}

		/**
		 * @param weatherCode the weatherCode to set
		 */
		public void setWeatherCode(int weatherCode) {
			this.weatherCode = weatherCode;
		}

		/**
		 * @return the weatherIcons
		 */
		public ArrayList<String> getWeatherIcons() {
			return weatherIcons;
		}

		/**
		 * @param weatherIcons the weatherIcons to set
		 */
		public void setWeatherIcons(ArrayList<String> weatherIcons) {
			this.weatherIcons = weatherIcons;
		}

		/**
		 * @return the weatherDescriptions
		 */
		public ArrayList<String> getWeatherDescriptions() {
			return weatherDescriptions;
		}

		/**
		 * @param weatherDescriptions the weatherDescriptions to set
		 */
		public void setWeatherDescriptions(ArrayList<String> weatherDescriptions) {
			this.weatherDescriptions = weatherDescriptions;
		}

		/**
		 * @return the windSpeed
		 */
		public int getWindSpeed() {
			return windSpeed;
		}

		/**
		 * @param windSpeed the windSpeed to set
		 */
		public void setWindSpeed(int windSpeed) {
			this.windSpeed = windSpeed;
		}

		/**
		 * @return the windDegree
		 */
		public int getWindDegree() {
			return windDegree;
		}

		/**
		 * @param windDegree the windDegree to set
		 */
		public void setWindDegree(int windDegree) {
			this.windDegree = windDegree;
		}

		/**
		 * @return the wind_Dir
		 */
		public String getWind_Dir() {
			return wind_Dir;
		}

		/**
		 * @param wind_Dir the wind_Dir to set
		 */
		public void setWind_Dir(String wind_Dir) {
			this.wind_Dir = wind_Dir;
		}

		/**
		 * @return the pressure
		 */
		public int getPressure() {
			return pressure;
		}

		/**
		 * @param pressure the pressure to set
		 */
		public void setPressure(int pressure) {
			this.pressure = pressure;
		}

		/**
		 * @return the precip
		 */
		public int getPrecip() {
			return precip;
		}

		/**
		 * @param precip the precip to set
		 */
		public void setPrecip(int precip) {
			this.precip = precip;
		}

		/**
		 * @return the humidity
		 */
		public int getHumidity() {
			return humidity;
		}

		/**
		 * @param humidity the humidity to set
		 */
		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}

		/**
		 * @return the cloudcover
		 */
		public int getCloudcover() {
			return cloudcover;
		}

		/**
		 * @param cloudcover the cloudcover to set
		 */
		public void setCloudcover(int cloudcover) {
			this.cloudcover = cloudcover;
		}

		/**
		 * @return the feelslike
		 */
		public int getFeelslike() {
			return feelslike;
		}

		/**
		 * @param feelslike the feelslike to set
		 */
		public void setFeelslike(int feelslike) {
			this.feelslike = feelslike;
		}

		/**
		 * @return the uvIndex
		 */
		public int getUvIndex() {
			return uvIndex;
		}

		/**
		 * @param uvIndex the uvIndex to set
		 */
		public void setUvIndex(int uvIndex) {
			this.uvIndex = uvIndex;
		}

		/**
		 * @return the visibility
		 */
		public int getVisibility() {
			return visibility;
		}

		/**
		 * @param visibility the visibility to set
		 */
		public void setVisibility(int visibility) {
			this.visibility = visibility;
		}

		/**
		 * @return the isDay
		 */
		public String getIsDay() {
			return isDay;
		}

		/**
		 * @param isDay the isDay to set
		 */
		public void setIsDay(String isDay) {
			this.isDay = isDay;
		}

		@Override
		public int hashCode() {
			return Objects.hash(cloudcover, feelslike, humidity, isDay, observationTime, precip, pressure, temperature,
					uvIndex, visibility, weatherCode, weatherDescriptions, weatherIcons, windDegree, windSpeed,
					wind_Dir);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Current other = (Current) obj;
			return cloudcover == other.cloudcover && feelslike == other.feelslike && humidity == other.humidity
					&& Objects.equals(isDay, other.isDay) && Objects.equals(observationTime, other.observationTime)
					&& precip == other.precip && pressure == other.pressure && temperature == other.temperature
					&& uvIndex == other.uvIndex && visibility == other.visibility && weatherCode == other.weatherCode
					&& Objects.equals(weatherDescriptions, other.weatherDescriptions)
					&& Objects.equals(weatherIcons, other.weatherIcons) && windDegree == other.windDegree
					&& windSpeed == other.windSpeed && Objects.equals(wind_Dir, other.wind_Dir);
		}
	    
		
}
