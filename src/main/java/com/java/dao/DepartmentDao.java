package com.java.dao;

import com.java.entities.Department;

public interface DepartmentDao {
	
	public void saveDepartment(Department department);
	public Department findDepartment(Department department);
	public Object updateDepartment(Department department);
}
