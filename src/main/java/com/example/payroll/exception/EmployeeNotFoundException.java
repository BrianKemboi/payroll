package com.example.payroll.exception;

public class EmployeeNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 827994593504170475L;

	public EmployeeNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
	}