package com.pavan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.Count;
import com.pavan.service.CountService;

@RestController
public class CountController {
	@Autowired
	private CountService countService;
	
	//Insert
	@PostMapping("/count")
	public ResponseEntity<Count> createCount(@RequestBody Count co){
		Count c=countService.createCount(co);
		return new ResponseEntity<Count>(c,HttpStatus.CREATED);
	}
	//---------------------OR-----------------------------------
//	@PostMapping("/count")
//	public Count createCount(@RequestBody Count co) {
//		return countService.createCount(co);
//	}
	
	//Read
	@GetMapping("/count")
	public List<Count> fetchCountList(){
		return(List<Count>) countService.fetchCounList();
	}
	
	//update
	@PutMapping("/count/{id}")
	public ResponseEntity<Count> updateCount(@RequestBody Count co,@PathVariable("id") int b_id){
		Count c=countService.updateCount(co, b_id);
		return new ResponseEntity<Count>(co, HttpStatus.OK);
	}
	
	//Delete
	@DeleteMapping("/count/{id}")
	public String deleteCount(@PathVariable("id") int b_id) {
		countService.deleteCount(b_id);
		return "Delete Success";
	}
}
