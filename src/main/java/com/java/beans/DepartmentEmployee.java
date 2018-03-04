package com.java.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.java.entities.Employee;

public class DepartmentEmployee implements Serializable {
	private static final long serialVersionUID = 5932861168963757075L;

	
	//private Integer empNo;
	
	
	private Integer deptNo;
	private Date fromDate;
	private Date toDate;
	private Set<Employee> employees;

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
}
