package com.pavan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pavan.model.Department;
@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
	

}
