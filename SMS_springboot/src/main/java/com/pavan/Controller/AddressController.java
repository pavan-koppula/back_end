package com.pavan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.Entity.Address;
import com.pavan.service.AddressService;

@RestController 
public class AddressController {

	@Autowired
	private AddressService addressSer;
	
	//Inert Operation
	@PostMapping("/address")
	public Address insertAddress(@RequestBody Address adr) {
		return addressSer.insertAddress(adr);
	}
	
	//Read
	@GetMapping("/address")
	public List<Address> ferchAddress(){
		return (List<Address>) addressSer.fetchAddressLit();
	}
	
	//Update
	@PutMapping("/address{id}")
	public Address updateAddress(@RequestBody Address adr,@PathVariable("id") Integer s_id) {
		return addressSer.updateAddress(adr, s_id);
	}
	
	//Delete
	@DeleteMapping("/address{id}")
	public String deleteAddress(@PathVariable Integer s_id) {
		addressSer.deleteAddress(s_id);
		return "Delete Sucessfull";
	}
}
