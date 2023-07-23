package com.javastack.spring.hellohuman.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.javastack.spring.hellohuman.models.ninjas;
import com.javastack.spring.hellohuman.repositories.ninjasRepository;

@Service
public class ninjasService {
 
	private final ninjasRepository ninjasRepository;
	
	 public ninjasService(ninjasRepository ninjasRepository) {
	        this.ninjasRepository = ninjasRepository;
	    }	
	 
	 public List<ninjas> allninjas() {
			return ninjasRepository.findAll();
		}
	 public ninjas creatninjas(ninjas ninjas) {
		  return ninjasRepository.save(ninjas);
		  
	  }
	 public void delete(long id) {
  		  ninjasRepository.deleteById(id);
  	 }
	 public ninjas editedojos(ninjas ninjas) {
		 return ninjasRepository.save(ninjas);
		
	}
}
