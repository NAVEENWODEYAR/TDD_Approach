package com.restsapi.rest_api_testing.exception;

import java.util.Objects;

import org.springframework.http.HttpStatus;

public class CloudVendorException {

	private String message;
    private Throwable throwable;
    private HttpStatus httpStatus;
    
    public CloudVendorException() {}
    
	/**
	 * @param message
	 * @param throwable
	 * @param httpStatus
	 */
	public CloudVendorException(String message, Throwable throwable, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the throwable
	 */
	public Throwable getThrowable() {
		return throwable;
	}

	/**
	 * @param throwable the throwable to set
	 */
	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	/**
	 * @return the httpStatus
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param httpStatus the httpStatus to set
	 */
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(httpStatus, message, throwable);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CloudVendorException other = (CloudVendorException) obj;
		return httpStatus == other.httpStatus && Objects.equals(message, other.message)
				&& Objects.equals(throwable, other.throwable);
	}

	@Override
	public String toString() {
		return "CloudVendorException [message=" + message + ", throwable=" + throwable + ", httpStatus=" + httpStatus
				+ "]";
	}
    
}
