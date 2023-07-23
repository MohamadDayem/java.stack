package com.javastack.spring.hellohuman.controllers; 

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javastack.spring.hellohuman.models.Burger;
import com.javastack.spring.hellohuman.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	 private final BurgerService burgerService; 
	public BurgerController(BurgerService burgerService) {
		super();
		this.burgerService = burgerService;
	}



	@GetMapping("/")
	public String home (@ModelAttribute("burger")Burger burger, Model model) {
		List<Burger> burgers = burgerService.allBurgers();
		model.addAttribute("burgers",burgers);
		return "index.jsp";
	}
	

	    @PostMapping("/addBurger")
	    public String home (@Valid@ModelAttribute("burger")Burger burger,BindingResult result, Model model) {
	    	if(result.hasErrors()) {
			List<Burger> burgers = burgerService.allBurgers();
			model.addAttribute("burgers",burgers);
			return "index.jsp";
		}else {
			 burgerService.addBurger(burger);
		      return "redirect:/";
		}
	      
	}
	    
	    @GetMapping("/edit/{id}")
	    public String edit(@PathVariable("id") Long id, Model model) {
	    	  Burger burger = burgerService.findburger(id);
	          model.addAttribute("burger", burger);
	          return "edit.jsp";
	    }
	    @RequestMapping(value="/burger/{id}", method=RequestMethod.PUT)
	    public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            model.addAttribute("burger", burger);
	            return "edit.jsp";
	        } else {
	            burgerService.editeBurger(burger);
	            return "redirect:/";  //eza home page//
	          //  return "redirect:/burger/{id}";  // detals page//
	        }
	    }
	    @GetMapping("/burger/{id}")  // detals ///
	    public String detals(@PathVariable("id") Long id, Model model) {
	    	  Burger burger = burgerService.findburger(id);
	          model.addAttribute("burger", burger);
	          return "detals.jsp";
	    }
	    
	    @GetMapping("/burgerr/{id}")
	    public String delete(@PathVariable("id") Long id) {
	        burgerService.delete(id);
	        return "redirect:/";
	    }
	   
	    }

	



