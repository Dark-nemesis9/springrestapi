package com.spring.demo.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.demo.entities.Department;
import com.spring.demo.repos.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
	
		return departmentRepository.save(department);
	}
	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepository.findAll();
	}
	@Override
	public Department fetchDepartmentById(Long departmentId) {
		
		return departmentRepository.findById(departmentId).get();
	}
	@Override
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
		
	}
	@Override
	public Department fetchDepartmentByName(String departmentName) {
		
		return departmentRepository.findByDepartmentName(departmentName);
	}
	
	
}
