package com.pavan.repository;

import org.springframework.data.repository.CrudRepository;

import com.pavan.Entity.Address;

public interface AddressRepo extends CrudRepository<Address, Integer> {

}
