package com.niit.mapper.service;

import java.util.List;

import com.niit.mapper.model.Employee;

public interface EmployeeService {
	public Employee findEmployeeById(int empId);
	public List<Employee> findAllEmployees();
	public Employee findEmployeeByName(String name);
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(int empId);
}
