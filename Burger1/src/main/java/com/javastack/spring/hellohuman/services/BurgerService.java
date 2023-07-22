package com.javastack.spring.hellohuman.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javastack.spring.hellohuman.models.Burger;
import com.javastack.spring.hellohuman.repositories.BurgerRepository;

 @Service
public class BurgerService {

	private final BurgerRepository burgerRepo;
	
	public BurgerService(BurgerRepository burgerRepo) {
		this.burgerRepo = burgerRepo;
	} 
	public List<Burger> allBurgers() {
		return burgerRepo.findAll();
	}
	public Burger addBurger(Burger burger) {
		return burgerRepo.save(burger);
	}
	
	public Burger editeBurger(Burger burger) {
		 return burgerRepo.save(burger);
		
	}
	
	 public Burger findburger(Long id) {
	        Optional<Burger> optionalburger = burgerRepo.findById(id);
	        if(optionalburger.isPresent()) {
	            return optionalburger.get();
	        } else {
	            return null;
	        }
	 }
	 
	 public void delete(long id) {
		  burgerRepo.deleteById(id);
	 }
}


