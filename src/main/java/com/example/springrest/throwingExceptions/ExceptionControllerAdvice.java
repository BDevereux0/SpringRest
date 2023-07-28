package com.example.springrest.throwingExceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(IncorrectCurrencyException.class)
    public ResponseEntity<ErrorDetails> exceptionIncorrectCurrency(IncorrectCurrencyException incorrectCurrencyException){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Incorrect Currency attempt");

        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
