package com.java.dao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.common.dao.AbstractDao;
import com.java.configuration.ConnectionFactory;
import com.java.dao.DepartmentDao;
import com.java.entities.Department;
import com.java.entities.Employee;

@Repository
@Transactional
public class DepartmentDaoImpl extends AbstractDao implements DepartmentDao {

	@Autowired
	ConnectionFactory connectionFactory;

	public void saveDepartment(Department department) {
		save(department);
	}
	
	public Department findDepartment(Department department) {
		return connectionFactory.getSession().get(Department.class, department.getDeptNo());
	}
	
	public Object updateDepartment(Department department) {
		return connectionFactory.getSession().merge(department);
	}

	public ConnectionFactory getConnectionFactory() {
		return connectionFactory;
	}

	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}

}
