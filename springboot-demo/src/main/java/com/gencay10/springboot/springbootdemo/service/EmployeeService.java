package com.gencay10.springboot.springbootdemo.service;

import java.util.List;

import com.gencay10.springboot.springbootdemo.entity.Employee;

public interface EmployeeService {
	
	
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
