package com.infy.springbootrestapicrud.app.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // use this annonatation if your working with Rest API
//@ControllerAdvice //makes class as a exception handler
public class GlobalExceptionHandler
{
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> productNotFoundExceptionHandler(ProductNotFoundException e)
	{
		System.out.println("Handle the  Exception");
		String message = e.getMessage();
		return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e)
	{
		System.out.println("Handler method");

		Map<String, String> map = new HashMap<>();

		for (FieldError fe : e.getBindingResult().getFieldErrors())
		{
			map.put(fe.getField(), fe.getDefaultMessage());
		}

		return new ResponseEntity<>(map,HttpStatus.OK);
	}
}
