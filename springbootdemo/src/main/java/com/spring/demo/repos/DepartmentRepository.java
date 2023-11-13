package com.spring.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.demo.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	public Department findByDepartmentName(String departmentName); 
	
	@Query()
	public Department findByDepartmentNameIgnoreCase(String departmentName);
}
