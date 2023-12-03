package com.pavan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pavan.Entity.Marks;

@Repository
public interface MarksRepo extends CrudRepository<Marks, Integer>{

}
