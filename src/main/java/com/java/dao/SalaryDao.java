package com.java.dao;

import com.java.entities.Salary;

public interface SalaryDao {
	public void saveSalary(Salary salary);

	public void deleteSalary(Salary salary);

	public Object updateSalary(Salary salary);
}
