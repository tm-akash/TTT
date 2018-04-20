package com.niit.skillmapper.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.skillMapper.Repository.EmployeeRepo;
import com.niit.skillMapper.model.Employee;

public class RegisterController extends HttpServlet{
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	        response.setContentType("text/html");  
	      //  PrintWriter out=response.getWriter();  
	          
	        String name=request.getParameter("name"); 
	        Integer empid=Integer.parseInt(request.getParameter("empid"));
	        String password=request.getParameter("password");  
	        String role=request.getParameter("role");
	          
	        Employee bean=new Employee();  
	        bean.setName(name);
	        bean.setNoOfStudents(10);
	        bean.setTeachInHrs(80);
	        bean.setEid(empid);
	        bean.setCity("mum");   //used city
	        bean.setPassword(password);
	        bean.setRole(role);
	        bean.setFlag(true);
	        EmployeeRepo emp=new EmployeeRepo();
	        emp.insertEmp(bean);
	        request.setAttribute("bean",bean);  
	          
	    //    boolean status=bean.validate(); 
	        boolean status=true;
	          
	        if(status){  
	            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/login_success.jsp");  
	            rd.forward(request, response);  
	        }  
	        else{  
	            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/login-error.jsp");  
	            rd.forward(request, response);  
	        }  
	      
	    }  
	  
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	    	RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/index.jsp");  
         rd.forward(request, response);  
	        
	    }   

}
