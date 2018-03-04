package com.java.service;

import com.java.entities.Salary;

public interface SalaryService {
	public void saveSalary(Salary salary);

	public void deleteSalary(Salary salary);

	public Object updateSalary(Salary salary);
}
