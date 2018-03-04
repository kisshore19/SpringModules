package com.java.dao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.common.dao.AbstractDao;
import com.java.configuration.ConnectionFactory;
import com.java.dao.SalaryDao;
import com.java.entities.Salary;

@Repository
@Transactional
public class SalaryDaoImpl extends AbstractDao implements SalaryDao {

	@Autowired
	ConnectionFactory connectionFactory;

	public void saveSalary(Salary salary) {
		save(salary);

	}

	public void deleteSalary(Salary salary) {
		delete(salary);
	}

	public Object updateSalary(Salary salary) {
		return connectionFactory.getSession().merge(salary);
	}

}
