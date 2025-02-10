package com.restsapi.rest_api_testing.exception;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */

public class CloudVendorNotFoundException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CloudVendorNotFoundException(String message) {
        super(message);
    }

    public CloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
