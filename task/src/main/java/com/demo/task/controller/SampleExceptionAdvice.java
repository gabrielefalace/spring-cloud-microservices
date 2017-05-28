package com.demo.task.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SampleExceptionAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(SampleException.class)
    public ResponseEntity<Object> handleNotFound(RuntimeException re, WebRequest request) {
        return handleExceptionInternal(re, re.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

}
