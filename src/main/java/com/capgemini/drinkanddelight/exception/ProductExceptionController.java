package com.capgemini.drinkanddelight.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionController {

	@ExceptionHandler(value = ProductOrderException.class)
	public ResponseEntity<Object> exceptionHandling (ProductOrderException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.OK);
	}
	
}
