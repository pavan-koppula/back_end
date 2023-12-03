package com.pavan.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pavan.model.Books;

@Repository
public interface BookRepo extends CrudRepository<Books, Integer>{

}
