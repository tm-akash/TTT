package com.niit.mapper.dao;

import java.util.List;

import com.niit.mapper.model.Employee;

public interface EmployeeDao {
	public Employee findById(int empId);
	public List<Employee> findAll();
	public Employee findByName(String name);
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(int empId);

}
