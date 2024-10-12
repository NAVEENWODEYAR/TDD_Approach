package com.unit.mockito.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
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
	
	    public Location() {}

		public Location(String name, String country, String region, String lat, String lon, String timezoneId,
				String localtime, int localtime_epoch, String utcOffset) {
			super();
			this.name = name;
			this.country = country;
			this.region = region;
			this.lat = lat;
			this.lon = lon;
			this.timezoneId = timezoneId;
			this.localtime = localtime;
			this.localtime_epoch = localtime_epoch;
			this.utcOffset = utcOffset;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the country
		 */
		public String getCountry() {
			return country;
		}

		/**
		 * @param country the country to set
		 */
		public void setCountry(String country) {
			this.country = country;
		}

		/**
		 * @return the region
		 */
		public String getRegion() {
			return region;
		}

		/**
		 * @param region the region to set
		 */
		public void setRegion(String region) {
			this.region = region;
		}

		/**
		 * @return the lat
		 */
		public String getLat() {
			return lat;
		}

		/**
		 * @param lat the lat to set
		 */
		public void setLat(String lat) {
			this.lat = lat;
		}

		/**
		 * @return the lon
		 */
		public String getLon() {
			return lon;
		}

		/**
		 * @param lon the lon to set
		 */
		public void setLon(String lon) {
			this.lon = lon;
		}

		/**
		 * @return the timezoneId
		 */
		public String getTimezoneId() {
			return timezoneId;
		}

		/**
		 * @param timezoneId the timezoneId to set
		 */
		public void setTimezoneId(String timezoneId) {
			this.timezoneId = timezoneId;
		}

		/**
		 * @return the localtime
		 */
		public String getLocaltime() {
			return localtime;
		}

		/**
		 * @param localtime the localtime to set
		 */
		public void setLocaltime(String localtime) {
			this.localtime = localtime;
		}

		/**
		 * @return the localtime_epoch
		 */
		public int getLocaltime_epoch() {
			return localtime_epoch;
		}

		/**
		 * @param localtime_epoch the localtime_epoch to set
		 */
		public void setLocaltime_epoch(int localtime_epoch) {
			this.localtime_epoch = localtime_epoch;
		}

		/**
		 * @return the utcOffset
		 */
		public String getUtcOffset() {
			return utcOffset;
		}

		/**
		 * @param utcOffset the utcOffset to set
		 */
		public void setUtcOffset(String utcOffset) {
			this.utcOffset = utcOffset;
		}

		@Override
		public int hashCode() {
			return Objects.hash(country, lat, localtime, localtime_epoch, lon, name, region, timezoneId, utcOffset);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Location other = (Location) obj;
			return Objects.equals(country, other.country) && Objects.equals(lat, other.lat)
					&& Objects.equals(localtime, other.localtime) && localtime_epoch == other.localtime_epoch
					&& Objects.equals(lon, other.lon) && Objects.equals(name, other.name)
					&& Objects.equals(region, other.region) && Objects.equals(timezoneId, other.timezoneId)
					&& Objects.equals(utcOffset, other.utcOffset);
		}
	    
	    
}
