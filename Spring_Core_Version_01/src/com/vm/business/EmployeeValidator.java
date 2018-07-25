package com.vm.business;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		return Employee.class.equals(getClass());
	}

	@Override
	public void validate(Object obj, Errors e) {
		
		ValidationUtils.rejectIfEmpty(e, "ename", "name.empty");
		
		
	Employee emp=(Employee) obj;
	
	if(emp.getEid()<0)

	{
		e.reject("eid", "Negitive Values");
	}

		
		
	}

}
