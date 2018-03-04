package com.java.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.entities.Employee;
import com.java.entities.Salary;
import com.java.service.DepartmentService;
import com.java.service.EmployeeService;
import com.java.service.SalaryService;
public class TestCalss {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-confix.xml");
		EmployeeService dd = (EmployeeService) applicationContext.getBean("employeeService");
		
		
		DepartmentService ds = (DepartmentService) applicationContext.getBean("departmentService");
		
		SalaryService ss = (SalaryService) applicationContext.getBean("salaryService");
		

		TestCalss testCalss = new TestCalss();
		/*Department department = new Department();
		department.setDeptNo("d003");
		Department findDepartment = ds.findDepartment(department);
		
		System.out.println(findDepartment.getDeptName());*/
		Employee findEmployee = testCalss.createNewEmployees();
		
		//Employee saveEmployee = dd.saveEmployee(findEmployee);
		
		
		Salary createNewSalary = testCalss.createNewSalary();
		createNewSalary.setEmployee(findEmployee);
		
		//findEmployee.setSalary(testCalss.createNewSalary());
		
		ss.saveSalary(createNewSalary);
		
		
		
		/*Employee e1 = testCalss.createNewEmployees();
				
		Set<Employee> emps = new HashSet<Employee>();
		emps.add(e1);
				Department department = new Department();
				department.setDeptName("kk");
				department.setDeptNo("d101");
				department.setEmployees(emps);
				ds.saveDepartment(department);
				*/
				
				
		//dd.deleteEmployee(testCalss.findEmployee());
		
		
		/*Employee findEmployee = dd.findEmployee(testCalss.findEmployee());
		//System.out.println(findEmployee);
		
		findEmployee.setFirstName("updatedkis");
		dd.updateEmployee(findEmployee);
		*/
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
		employee.setFirstName("kishoresal4");
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
	
	
	public Salary createNewSalary() {	
		Salary salary = new Salary();
		salary.setSalary(10000009);
		String fromDate = "15-04-1985";
		String toDate = "06-01-2015";

		Date fromDateConverted = null;
		Date toDateConverted = null;

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			toDateConverted = simpleDateFormat.parse(toDate);
			fromDateConverted = simpleDateFormat.parse(fromDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		salary.setFromDate(fromDateConverted);
		salary.setToDate(toDateConverted);

		return salary;
	}
	public Employee findEmployee() {
		Employee employee = new Employee();
		employee.setEmpNo(16);
		employee.setFirstName("KishoreUps3");
		return employee;
	}

}
