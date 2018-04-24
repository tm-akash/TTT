package com.niit.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.mapper.config.AppContext;
import com.niit.mapper.model.Employee;
import com.niit.mapper.service.EmployeeService;
import com.niit.mapper.serviceimpl.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)
public class EmployeeTest {

	@Autowired
	EmployeeService employeeService;
	
	@Before
	public void setUp() throws Exception
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}
	
	@Test
	public void addEmployee()
	{
		Employee employee=new Employee();
		
		employee.setEmpId(5);
		employee.setName("abcd");
		employee.setTeachInHrs(8);
		employee.setNoOfStudents(68);
		employee.setCity("mum");
		employee.setPassword("pass");
		employee.setRole("employee");
	//	EmployeeService employeeService=new EmployeeServiceImpl();
		boolean test=employeeService.addEmployee(employee);
		assertEquals("Employee not added",true,test);
	}
	
	@Test
	public void retrieveAllEmployees()
	{
		List<Employee> test=employeeService.findAllEmployees();
		if(	test != null)
		{
			System.out.println(test);
			assertTrue("All  employees couldn't retrieved", true);
		}
		
		else
		{
			assertFalse(false);
		}
	}
	

	

}
