
package com.pavan.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pavan.model.Borrower;

@Repository
public interface BorrowerRepo extends CrudRepository<Borrower, Integer>{

}
