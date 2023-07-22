package com.javastack.spring.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

import com.javastack.spring.hellohuman.services.BurgerService;

@Controller
public class BurgerController {

	
	private final BurgerService burgerService;
	
	public BurgerController(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
}
