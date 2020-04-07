package com.matera.wcc.calculadora.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<?> handleAritimethicException(ArithmeticException ex) {
        return ResponseEntity.badRequest().build();
    }
}
