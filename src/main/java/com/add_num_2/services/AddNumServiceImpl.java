package com.add_num_2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.add_num_2.entities.AddNum;
import com.add_num_2.repository.AddNumRepository;

@Service
public class AddNumServiceImpl implements AddNumService {

	@Autowired
	private AddNumRepository addRepo;

	@Override
	public void save(AddNum a) {
		
		addRepo.save(a);
	}

	@Override
	public int addTwoNumbers(int fnum, int snum) {
		
		return fnum + snum;
		
	}
	
	
}
