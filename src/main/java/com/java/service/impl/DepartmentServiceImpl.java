package com.java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.DepartmentDao;
import com.java.entities.Department;
import com.java.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	public void saveDepartment(Department department) {
		departmentDao.saveDepartment(department);
	}

	public Department findDepartment(Department department) {
		return departmentDao.findDepartment(department);
	}
	
	public Object updateDepartment(Department department) {
		return departmentDao.updateDepartment(department);
	}

	
	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	

}
