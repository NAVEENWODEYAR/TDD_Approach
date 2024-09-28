package com.unit.mockito.repo.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
@JsonIgnoreProperties
@JsonInclude
public class WeatherResponses {

	    private Current current;

	    public class Current {
	    	
	        private int temperature;
	        
	        @JsonProperty("weather_descriptions")
	        private List<String> weatherDescriptions;
	        
	        private int feelslike;
	        
	        public Current() {}
	        
			public Current(int temperature, List<String> weatherDescriptions, int feelslike) {
				super();
				this.temperature = temperature;
				this.weatherDescriptions = weatherDescriptions;
				this.feelslike = feelslike;
			}



			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + getEnclosingInstance().hashCode();
				result = prime * result + Objects.hash(feelslike, temperature, weatherDescriptions);
				return result;
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
				if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
					return false;
				return feelslike == other.feelslike && temperature == other.temperature
						&& Objects.equals(weatherDescriptions, other.weatherDescriptions);
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
			 * @return the weatherDescriptions
			 */
			public List<String> getWeatherDescriptions() {
				return weatherDescriptions;
			}
			/**
			 * @param weatherDescriptions the weatherDescriptions to set
			 */
			public void setWeatherDescriptions(List<String> weatherDescriptions) {
				this.weatherDescriptions = weatherDescriptions;
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

			private WeatherResponses getEnclosingInstance() {
				return WeatherResponses.this;
			}
	        
	        
	    }

	    public WeatherResponses() {}

	    public WeatherResponses(Current current) {
			super();
			this.current = current;
		}


		@Override
		public int hashCode() {
			return Objects.hash(current);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			WeatherResponses other = (WeatherResponses) obj;
			return Objects.equals(current, other.current);
		}

		/**
		 * @return the current
		 */
		public Current getCurrent() {
			return current;
		}

		/**
		 * @param current the current to set
		 */
		public void setCurrent(Current current) {
			this.current = current;
		}


}
