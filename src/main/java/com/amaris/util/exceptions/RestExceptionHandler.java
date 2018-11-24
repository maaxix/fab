package com.amaris.util.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);
	
	@ResponseBody
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	String ExceptionHandler(HttpServletRequest request, Exception ex) {
		logger.error("Exception Occured: URL="+request.getRequestURL() + " msg=" + ex.getMessage());
		return "Error conatct administrator";
	}
	// TODO: SecurityRuleException    -- have to send e-mail to the administrator
	// TODO: BusinessRuleException    -- generates a message to the user to correct his input
	
   //other exception handlers below

}