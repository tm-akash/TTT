package com.niit.mapper.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mapper.dao.EmployeeDao;
import com.niit.mapper.model.Employee;

@Repository("employeeDao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public Employee findById(int empId) {
		
		return (Employee) sessionFactory.getCurrentSession().createQuery("from Employee where empId="+empId).uniqueResult();
	}

	public Employee findByName(String name) {
		return (Employee) sessionFactory.getCurrentSession().createQuery("from Employee where name="+name).list().get(0);
				
		
	}

	public boolean addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return true;
	}

	public boolean updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return true;
	}

	public boolean deleteEmployee(int empId) {
		sessionFactory.getCurrentSession().delete(findById(empId));
		return true;
	}
	
	public List<Employee> findAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



}
