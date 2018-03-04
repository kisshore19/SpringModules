package com.java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.SalaryDao;
import com.java.entities.Salary;
import com.java.service.SalaryService;

@Service("salaryService")
public class SalaryServiceImpl implements SalaryService {
	@Autowired
	SalaryDao salaryDao;

	public void saveSalary(Salary salary) {
		salaryDao.saveSalary(salary);
	}

	public void deleteSalary(Salary salary) {
		salaryDao.deleteSalary(salary);
	}

	public Object updateSalary(Salary salary) {
		return salaryDao.updateSalary(salary);

	}

}
