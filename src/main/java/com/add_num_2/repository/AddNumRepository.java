package com.add_num_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.add_num_2.entities.AddNum;

public interface AddNumRepository extends JpaRepository<AddNum, Integer> {

}
