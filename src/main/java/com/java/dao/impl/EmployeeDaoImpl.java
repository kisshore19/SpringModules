package com.java.dao.impl;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.java.dao.EmployeeDao;
import com.java.entities.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl extends HibernateTransactionManager implements EmployeeDao{
	public void saveEmployee(Employee employee) {
		try {
			getSessionFactory().getCurrentSession().save(employee);
			//getHibernateTemplate().save(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Saved");
	}

}
