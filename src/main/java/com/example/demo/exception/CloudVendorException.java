package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class CloudVendorException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

}
