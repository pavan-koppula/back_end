package com.pavan.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.Repository.CountRepo;
import com.pavan.model.Count;
import com.pavan.service.CountService;
@Service
public class CountServiceImpl implements CountService {

	@Autowired
	private CountRepo countRepo;
	@Override
	public Count createCount(Count co) {
		return countRepo.save(co);
	}

	@Override
	public List<Count> fetchCounList() {
		return (List<Count>) countRepo.findAll();
	}

	@Override
	public Count updateCount(Count co, int b_id) {
		Count c=countRepo.findById(b_id).get();
		if(co.getB_id()==c.getB_id()) {
			c.setB_count(co.getB_count());
			c.setB_org_count(co.getB_org_count());
		}
		return countRepo.save(co);
	}

	@Override
	public void deleteCount(int b_id) {
		countRepo.deleteById(b_id);
	}

}
