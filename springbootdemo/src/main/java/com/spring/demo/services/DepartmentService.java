package com.spring.demo.services;

import java.util.List;

import com.spring.demo.entities.Department;

public interface DepartmentService {

public	Department saveDepartment(Department department);

public List<Department> fetchDepartmentList();

public Department fetchDepartmentById(Long departmentId);

public void deleteDepartmentById(Long departmentId);

public  Department fetchDepartmentByName(String departmentName);
	





	








}
