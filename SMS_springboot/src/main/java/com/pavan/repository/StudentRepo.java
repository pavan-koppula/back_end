package com.pavan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pavan.Entity.Student;
@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
	
}
