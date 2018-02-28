package com.java.beans;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.dao.impl.EmployeeDaoImpl;
import com.java.entities.Employee;

public class TestCalss {
	@Autowired
	PrintBeanProps printBeanProps;

	public void method1() {
		printBeanProps.print();
	}
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-confix.xml");
		EmployeeDaoImpl dd= (EmployeeDaoImpl)applicationContext.getBean("employeeDaoImpl");
		/*TestCalss testCalss = new TestCalss();
		testCalss.method1();*/
		
		Employee employee = new Employee();
		employee.setEmpNo(123);
		employee.setFirstName("Kishore");
		employee.setLastName("oggu");
		employee.setGender("M");
		employee.setBirthDate(new Date(1985,04,15));
		employee.setBirthDate(new Date(2015,06,01));
		
		dd.saveEmployee(employee);
	}
	

	public PrintBeanProps getPrintBeanProps() {
		return printBeanProps;
	}

	public void setPrintBeanProps(PrintBeanProps printBeanProps) {
		this.printBeanProps = printBeanProps;
	}
	
	

}
