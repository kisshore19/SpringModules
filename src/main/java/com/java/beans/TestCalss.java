package com.java.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.entities.Employee;
import com.java.service.EmployeeService;
public class TestCalss {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-confix.xml");
		EmployeeService dd = (EmployeeService) applicationContext.getBean("employeeService");

		TestCalss testCalss = new TestCalss();

		Employee findEmployee = dd.findEmployee(testCalss.findEmployee());
		//System.out.println(findEmployee);
		
		findEmployee.setFirstName("updatedkis");
		dd.updateEmployee(findEmployee);
		
		//System.out.println(dd.findEmployeeByName(testCalss.findEmployee()).size());
		//dd.saveEmployee(testCalss.createNewEmployees());
		// dd.deleteEmployee(employee);
		/*
		 * ExecutorService executorService = try { Thread.sleep(1000 * 20);
		 * dd.deleteEmployee(employee); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

	public Employee createNewEmployees() {	
		Employee employee = new Employee();
		// employee.setEmpNo(123+ new Random().nextInt());
		employee.setFirstName("KishoreWithQup");
		employee.setLastName("oggu");
		employee.setGender("M");
		String birthDate = "15-04-1985";
		String hireDate = "06-01-2015";

		Date birthDateConverted = null;
		Date hireDateConverted = null;

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			hireDateConverted = simpleDateFormat.parse(hireDate);
			birthDateConverted = simpleDateFormat.parse(birthDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employee.setBirthDate(birthDateConverted);
		employee.setHireDate(hireDateConverted);

		return employee;
	}
	
	public Employee findEmployee() {
		Employee employee = new Employee();
		employee.setEmpNo(5);
		employee.setFirstName("KishoreUps3");
		return employee;
	}

}
