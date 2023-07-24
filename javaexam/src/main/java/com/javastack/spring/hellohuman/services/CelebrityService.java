package com.javastack.spring.hellohuman.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.javastack.spring.hellohuman.models.Celebrity;

import com.javastack.spring.hellohuman.repositories.CelebrityRepository;


@Service
public class CelebrityService {
	private final CelebrityRepository CelebrityRepository;
	
	 public CelebrityService(CelebrityRepository CelebrityRepository) {
	        this.CelebrityRepository = CelebrityRepository;
	    }	
	 
	 public Iterable<Celebrity> allCelebrity() {
			//return CelebrityRepository.findAllCelebrities();
		 return CelebrityRepository.findAll();
		}
	 public Celebrity creatCelebrity(Celebrity Celebrity) {
		  return CelebrityRepository.save(Celebrity);
		  
	  }
	 public void delete(long id) {
 		  CelebrityRepository.deleteById(id);
 	 }
	 public Celebrity editeCelebrity(Celebrity Celebrity) {
		 return CelebrityRepository.save(Celebrity);
		
	}
	 public Celebrity findCelebrity(Long id) {
	        Optional<Celebrity> optionalCelebrity = CelebrityRepository.findById(id);
	        if(optionalCelebrity.isPresent()) {
	            return optionalCelebrity.get();
	        } else {
	            return null;
	        }
	 }
}
