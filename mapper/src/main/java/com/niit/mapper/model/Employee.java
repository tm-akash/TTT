package com.niit.mapper.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer empId;
	private String name;
	private Integer teachInHrs;
	private Integer noOfStudents;
	private String city;
	private String password;
	private String role;
	private boolean flag;

	public boolean getFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTeachInHrs() {
		return teachInHrs;
	}
	public void setTeachInHrs(Integer teachInHrs) {
		this.teachInHrs = teachInHrs;
	}
	public Integer getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(Integer noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	
	/*public boolean validate(){  
	    if(password.equals("abc")){  
	        return true;  
	    }  
	    else{  
	        return false;  
	    }  
	}   */

}
