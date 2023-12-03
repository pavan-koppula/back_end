package com.pavan.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.Entity.Address;
import com.pavan.repository.AddressRepo;
import com.pavan.service.AddressService;

@Service
public class AddressImpl implements AddressService{
	@Autowired
	private AddressRepo addrepo;
	@Override
	public Address insertAddress(Address adr) {
		return addrepo.save(adr);
	}

	@Override
	public List<Address> fetchAddressLit() {
		return (List<Address>) addrepo.findAll();
	}

	@Override
	public Address updateAddress(Address adr, int s_id) {
		Address ad=addrepo.findById(s_id).get();
		if(adr.getS_id()==ad.getS_id()) {
			ad.setCity(adr.getCity());
			ad.setFather_Name(adr.getFather_Name());
		}
		return addrepo.save(adr);
	}

	@Override
	public void deleteAddress(int s_id) {
		addrepo.deleteById(s_id);
	}

}
