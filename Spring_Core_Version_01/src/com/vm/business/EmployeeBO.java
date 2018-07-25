package com.vm.business;

public class EmployeeBO {
	
	EmployeeDaoInterface  dao;
	
	
	
	public EmployeeBO(EmployeeDaoInterface dao) {
		super();
		this.dao = dao;
	}



	public int createEmployee(Employee e)
	{
		
		return dao.saveEmp(e);
	}

	
	
}
