package com.pavan.service;

import java.util.List;

import com.pavan.Entity.Address;

public interface AddressService {

	//Insert Operation
	public Address insertAddress(Address adr);
	
	//Read Operation
	public List<Address> fetchAddressLit();
	
	//Update Operation 
	public Address updateAddress(Address adr,int s_id);
	
	//Delete Operation
	void deleteAddress(int s_id);
}
