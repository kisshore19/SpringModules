package com.java.service;

import com.java.entities.Department;

public interface DepartmentService {
	
		public void saveDepartment(Department department);
		public Department findDepartment(Department department);
		public Object updateDepartment(Department department);
}
