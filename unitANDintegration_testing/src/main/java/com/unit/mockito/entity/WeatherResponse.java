package com.unit.mockito.entity;

import java.util.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */

public class WeatherResponse {

	private Request request;
	
	private Root root;
	
	private Location location;

	public WeatherResponse(Request request, Root root, Location location) {
		super();
		this.request = request;
		this.root = root;
		this.location = location;
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
	 * @return the root
	 */
	public Root getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(Root root) {
		this.root = root;
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

	
}
