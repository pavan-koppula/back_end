package com.pavan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ClientController {
	
	@GetMapping("/get")
	public String gethome() {
		return "Home.jsp";
	}
	@PostMapping("/addClient")
	public String addClient(@RequestParam String FirstName,@RequestParam String LastName,@RequestParam String Email, Model model) {

		model.addAttribute("FName", FirstName);
		model.addAttribute("LName", LastName);
		model.addAttribute("Email", Email);
		return "success.jsp";
	}
}
