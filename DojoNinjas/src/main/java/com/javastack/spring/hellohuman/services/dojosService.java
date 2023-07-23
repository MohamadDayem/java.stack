package com.javastack.spring.hellohuman.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.javastack.spring.hellohuman.models.dojos;
import com.javastack.spring.hellohuman.repositories.dojosRepository;

@Service
public class dojosService {
	  private final dojosRepository dojosRepository;
	  
	  
	  
	  public dojosService(dojosRepository dojosRepository) {
	        this.dojosRepository = dojosRepository;
	    }
	
	  public List<dojos> alldojos(){
		  return dojosRepository.findAll();
	  }
	  public dojos creatdojos(dojos dojos) {
		  return dojosRepository.save(dojos);
		  
	  }
	  public dojos finddojos(Long id) {
	        Optional<dojos> optionaldojos = dojosRepository.findById(id);
	        if(optionaldojos.isPresent()) {
	            return optionaldojos.get();
	        } else {
	            return null;
	        }
	  }
	   	 public void delete(long id) {
	   		  dojosRepository.deleteById(id);
	   	 }
	   	 
	   	public dojos editedojos(dojos dojos) {
			 return dojosRepository.save(dojos);
			
		}
	   
}
