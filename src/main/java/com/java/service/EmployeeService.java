package com.java.service;

import java.util.List;

import com.java.entities.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee employee);

	public void deleteEmployee(Employee employee);

	public Object updateEmployee(Employee employee);

	public Employee findEmployee(Employee employee);
	
	public List<Employee> findEmployeeByName(Employee employee);

}
