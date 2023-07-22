package com.javastack.spring.hellohuman.services;

import com.javastack.spring.hellohuman.repositories.BurgerRepository;

public class BurgerService {

	private final BurgerRepository burgerRepo;
	
	public BurgerService(BurgerRepository burgerRepo) {
		this.burgerRepo = burgerRepo;
	}
}
