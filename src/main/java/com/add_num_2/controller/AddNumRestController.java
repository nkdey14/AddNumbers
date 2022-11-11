package com.add_num_2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.add_num_2.entities.AddNum;
import com.add_num_2.repository.AddNumRepository;

@RestController
@RequestMapping("/api/numbers")
public class AddNumRestController {
	
	@Autowired
	private AddNumRepository addRepo;
	
	// http://localhost:8085/api/numbers/num/6

	@GetMapping("/num/{id}")
	public AddNum getNumInfo(@PathVariable("id") int id) {
		
		Optional<AddNum> findById = addRepo.findById(id);
		
		AddNum numbers = findById.get();
		
		return numbers;
	}
}
