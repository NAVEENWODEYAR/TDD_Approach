package com.unit.mockito.entity;

import java.util.Objects;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
public class Request {

	private String type;

	private String query;

	private String language;

	private String unit;

	public Request() {}
	
	public Request(String type, String query, String language, String unit) {
		super();
		this.type = type;
		this.query = query;
		this.language = language;
		this.unit = unit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(language, query, type, unit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		return Objects.equals(language, other.language) && Objects.equals(query, other.query)
				&& Objects.equals(type, other.type) && Objects.equals(unit, other.unit);
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Request [type=" + type + ", query=" + query + ", language=" + language + ", unit=" + unit + "]";
	}
	
}
