package com.codegnan.springboot.thymleafdemo.service;

import java.util.List;

import com.codegnan.springboot.thymleafdemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
