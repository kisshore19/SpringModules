package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.EmployeeDao;
import com.java.entities.Employee;
import com.java.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}

	public void deleteEmployee(Employee employee) {
		employeeDao.deleteEmployee(employee);

	}

	public Object updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	public Employee findEmployee(Employee employee) {
		return employeeDao.findEmployee(employee);
	}
	
	public List<Employee> findEmployeeByName(Employee employee) {
		return employeeDao.findEmployeeByName(employee);
	}

}
