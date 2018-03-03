package com.java.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.common.dao.AbstractDao;
import com.java.configuration.ConnectionFactory;
import com.java.dao.EmployeeDao;
import com.java.entities.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

	@Autowired
	ConnectionFactory connectionFactory;

	public void saveEmployee(Employee employee) {
		save(employee);
		
	}

	public void deleteEmployee(Employee employee) {
		delete(employee);
	}

	public Object updateEmployee(Employee employee) {
		
		//Session session = connectionFactory.getSession();
		/*Employee find = session.find(Employee.class, employee.getEmpNo());
		
		BeanWrapper beanWrapper = new BeanWrapperImpl();
		BeanUtils.copyProperties(employee, find);
		find.setFirstName(employee.getFirstName());*/
		return connectionFactory.getSession().merge(employee);
		 //return null;
		 
		 
		//return update(employee);
	}

	public Employee findEmployee(Employee employee) {
		return connectionFactory.getSession().get(Employee.class, employee.getEmpNo());
	}

	public List<Employee> findEmployeeByName(Employee employee) {
		Query<Employee> createQuery = connectionFactory.getSession().createQuery("from Employee e where e.firstName=:fn");
		createQuery.setParameter("fn", employee.getFirstName());
		List<Employee> list = createQuery.list();
		System.out.println(list);
		return list;
	}

}
