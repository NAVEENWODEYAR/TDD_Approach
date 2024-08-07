package com.restsapi.rest_api_testing.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudVendorException {

    private String message;
    private Throwable throwable;
    private HttpStatus httpStatus;
}
