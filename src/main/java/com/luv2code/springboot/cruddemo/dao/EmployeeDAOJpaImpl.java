package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager thEntityManager) {  // Constructor Injection
		entityManager = thEntityManager;
	}
	
	
	@Override
	public List<Employee> findAll() {
		
		// create a query
		
		
		// execute query and get result list
		
		
		// return the results
		
		return null;
	}

	@Override
	public Employee findById(int theId) {
		
		return null;
	}

	@Override
	public void save(Employee theEmployee) {
		

	}

	@Override
	public void deleteById(int theId) {
		

	}

}
