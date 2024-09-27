package com.unit.mockito.entity;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
public class Root {
	
	 	private Request request;
	 	
	    private Location location;
	    
	    private Current current;
	    
	    public Root() {}

		public Root(Request request, Location location, Current current) {
			super();
			this.request = request;
			this.location = location;
			this.current = current;
		}

		@Override
		public int hashCode() {
			return Objects.hash(current, location, request);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Root other = (Root) obj;
			return Objects.equals(current, other.current) && Objects.equals(location, other.location)
					&& Objects.equals(request, other.request);
		}

		/**
		 * @return the request
		 */
		public Request getRequest() {
			return request;
		}

		/**
		 * @param request the request to set
		 */
		public void setRequest(Request request) {
			this.request = request;
		}

		/**
		 * @return the location
		 */
		public Location getLocation() {
			return location;
		}

		/**
		 * @param location the location to set
		 */
		public void setLocation(Location location) {
			this.location = location;
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
