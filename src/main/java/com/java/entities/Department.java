package com.java.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department implements Serializable {
	private static final long serialVersionUID = 8189904589491901058L;

	@Id
	@GeneratedValue
	@Column(name = "dept_no")
	private String deptNo;

	@Column(name = "dept_name")
	private String deptName;
	
	/*@Temporal(TemporalType.DATE)
	@Column(name = "from_date")
	private Date fromDate;
	@Column(name = "to_date")
	private Date toDate;*/
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(
			name = "dept_emp", 
			joinColumns = { @JoinColumn(name = "dept_no") },
			inverseJoinColumns = {
			@JoinColumn(name = "emp_no") })
	private Set<Employee> employees = new HashSet<Employee>(0);


	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}
