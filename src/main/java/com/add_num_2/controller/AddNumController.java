package com.add_num_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.add_num_2.entities.AddNum;
import com.add_num_2.services.AddNumService;

@Controller
public class AddNumController {
	
	@Autowired
	private AddNumService addService;

	// http://localhost:8085/viewAddNum
	
		@GetMapping("/viewAddNum")
		public String addNumbers() {
			
			return "addNum";
		}
		
		@PostMapping("/addNum")
		public String showNumbers(@ModelAttribute("add") AddNum a, Model model) {
			
			addService.save(a);
			
			model.addAttribute("add", a);
			
			return "showNum";
		}
		
		@GetMapping("/sum")
		public String showAddition(@RequestParam("fnum") int fnum, @RequestParam("snum") int snum, Model model) {
			
			int result = addService.addTwoNumbers(fnum, snum);
			
			model.addAttribute("res", result);
			
			return "findSum";
		}
}
