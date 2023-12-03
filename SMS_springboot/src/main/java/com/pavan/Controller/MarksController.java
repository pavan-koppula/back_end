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

import com.pavan.Entity.Marks;
import com.pavan.service.MarksService;

@RestController
public class MarksController {

	@Autowired
	private MarksService marser;
	
	//Insert Operation
	@PostMapping("/marks")
	public Marks saveMarks(@RequestBody Marks mar) {
		return marser.saveMarks(mar);
	}
	
	//Read Operation
	@GetMapping("/marks")
	public List<Marks> readMarks() {
		return marser.fetchMarksList();
	}
	//Update Operation
	@PutMapping("/marks/{id}")
	public Marks updateMarks(@RequestBody Marks mar,@PathVariable("id") int s_id) {
		return marser.updateMarks(mar, s_id);
	}
	
	//Delete Operation
	@DeleteMapping("/marks/{id}")
	public String deleteMarks(@PathVariable("id") int s_id) {
	marser.deleteMarks(s_id);
	return "Delete Sucessfull";}
	
}
