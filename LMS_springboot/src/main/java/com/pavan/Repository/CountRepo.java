package com.pavan.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pavan.model.Count;

@Repository
public interface CountRepo extends CrudRepository<Count, Integer>{

}
