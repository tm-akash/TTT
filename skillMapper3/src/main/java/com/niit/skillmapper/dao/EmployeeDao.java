package com.niit.skillmapper.dao;

import java.util.list;

public interface EmployeeDao {

	public list<Employee> findAll();
	public Employee findById(int empId);
	
}
