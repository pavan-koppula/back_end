package com.pavan.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.Entity.Marks;
import com.pavan.repository.MarksRepo;
import com.pavan.service.MarksService;

@Service
public class MarksImpl implements MarksService{
	@Autowired
	public MarksRepo marksrepo;
	
	//Insert Operation
	@Override
	public Marks saveMarks(Marks mar) {
		return marksrepo.save(mar);
	}
	//Read Operation
	@Override
	public List<Marks> fetchMarksList() {
		return (List<Marks>) marksrepo.findAll();
	}
	//Update Operation
	@Override
	public Marks updateMarks(Marks mar, int s_id) {
		Marks m=marksrepo.findById(s_id).get();
		if(mar.getS_id()==m.getS_id()) {
	
			m.setTel(mar.getTel());
			m.setEng(mar.getEng());
			m.setHid(mar.getHid());
			m.setMat(mar.getMat());
			m.setSic(mar.getSic());
			m.setSoc(mar.getSoc());
		}
		return marksrepo.save(mar);
	}
	//Delete Operation
	@Override
	public void deleteMarks(int s_id) {
		marksrepo.deleteById(s_id);
	}

}
