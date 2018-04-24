package com.niit.mapper.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.mapper.dao.EmployeeDao;
import com.niit.mapper.model.Employee;
import com.niit.mapper.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public Employee findEmployeeById(int empId) {
		
		return employeeDao.findById(empId);
	}

	public List<Employee> findAllEmployees() {
		
		return employeeDao.findAll();
	}

	public Employee findEmployeeByName(String name) {
		return employeeDao.findByName(name);
	}

	public boolean addEmployee(Employee employee) {
		if(employeeDao.findById(employee.getEmpId()) != null)
		{
			return false;
		}
		else
		{
			employeeDao.addEmployee(employee);
			return true;
		}
		
	}

	public boolean updateEmployee(Employee employee) {
		if(employeeDao.findById(employee.getEmpId()) != null)
		{
		/*	Employee emp=new Employee();
			emp.setName(employee.getName());
			emp.setRole(employee.getRole());*/
			employeeDao.updateEmployee(employee);
			return true;
		}
		else
		{
			
			return false;
		}
		
	}

	public boolean deleteEmployee(int empId) {
		if(employeeDao.findById(empId) != null)
		{
		/*	Employee emp=new Employee();
			emp.setName(employee.getName());
			emp.setRole(employee.getRole());*/
			employeeDao.deleteEmployee(empId);
			return true;
		}
		else
		{
			
			return false;
		}
	
	}

}
