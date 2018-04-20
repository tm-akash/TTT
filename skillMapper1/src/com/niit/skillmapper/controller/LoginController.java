package com.niit.skillmapper.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.skillMapper.Repository.EmployeeRepo;
import com.niit.skillMapper.model.Employee;


public class LoginController extends HttpServlet {
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException { 
		String userOperations = request.getServletPath();
		 response.setContentType("text/html");
		 Integer empid=Integer.parseInt(request.getParameter("empid"));
		 String password=request.getParameter("password");  
		 String role=request.getParameter("role");
		 
		 if(role.equalsIgnoreCase("HR"))
		 {
				try {
					findEmp(request, response);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		 }
		 
		 Employee employee=new Employee();
		 employee.setEid(empid);
		 employee.setPassword(password);
		 employee.setRole(role);
		 EmployeeRepo employeeRepo=new EmployeeRepo();
		 boolean status=employeeRepo.checkLogin(employee);
		 request.setAttribute("employee",employee);
		 if(status == false)
		 {
			 if(employee.getRole() == "employee")
			 {
			 
			 RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/login_success.jsp");  
	            rd.forward(request, response); 
			 }
			 else
			 {
				 
				 RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/login_success_accepted.jsp");  
		            rd.forward(request, response);  
			 }
		 }
		 else
		 {
			 RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/login-error.jsp");  
	            rd.forward(request, response);  
		 }
		 
		 
		
			
	}
	
	
	private void findEmp(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String fname = request.getParameter("fname");
		System.out.println("Fname is: " + fname);
		EmployeeRepo employeeRepo=new EmployeeRepo();
		List<Employee> empList = null;		//	employeeRepo.getEmpForManager(fname);
		for(Employee e:empList) {
			System.out.println("query output"+e.getName());
		}
		request.setAttribute("userList", empList);
		RequestDispatcher dispatcher =
		request.getRequestDispatcher("/WEB-INF/findEmp.jsp");
		//response.sendRedirect("findprofiles");
		dispatcher.forward(request, response);
	}
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
    	RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/index.jsp");  
     rd.forward(request, response);  
        
    }   
	
	 
	}  


