package com.javastack.spring.hellohuman.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javastack.spring.hellohuman.models.Burger;
import com.javastack.spring.hellohuman.models.Celebrity;
import com.javastack.spring.hellohuman.services.CelebrityService;

import jakarta.validation.Valid;
@Controller
public class CelebrityController {
	
	 private final CelebrityService CelebrityService;
	
	 public CelebrityController(CelebrityService CelebrityService ) {
		  
		  this.CelebrityService=CelebrityService;
		 
	  }
	 @GetMapping("/new")
	  public String index(@ModelAttribute("Celebrity") Celebrity Celebrity) {
		  return "creatC.jsp";
	  }
	  
	 @PostMapping("/addCelebrity")
	  public String home (@ModelAttribute("Celebrity")Celebrity Celebrity) {
	  
			 CelebrityService.creatCelebrity(Celebrity);
		      return "redirect:/welcome";
		
	  }
	
	 @GetMapping("/a")
		public String all (@ModelAttribute("Celebrity")Celebrity Celebrity, Model model) {
			Iterable<Celebrity> celebrity = CelebrityService.allCelebrity();
			model.addAttribute("Celebrity",celebrity);
			//model.addAttribute("Count",celebrity.size());
			return "welcome.jsp";
		}
	 @GetMapping("/edit/{id}")
	    public String edit(@PathVariable("id") Long id, Model model) {
	    	  Celebrity Celebrity =  CelebrityService.findCelebrity(id);
	          model.addAttribute("Celebrity", Celebrity);
	          return "edit.jsp";
}
	 
	 @RequestMapping(value="/editee/{id}", method=RequestMethod.PUT)
	    public String update(@Valid @ModelAttribute("Celebrity") Celebrity Celebrity, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            model.addAttribute("Celebrity", Celebrity);
	            return "edit.jsp";
	        } else {
	            CelebrityService.editeCelebrity(Celebrity);
	            return "redirect:/welcome";  //eza home page//
	          //  return "redirect:/burger/{id}";  // detals page//
	        }
}
	 
	 @GetMapping("/delet/{id}")
	    public String delete(@PathVariable("id") Long id) {
	        CelebrityService.delete(id);
	        return "redirect:/welcome";
	    }
	 @GetMapping("/show/{id}")  // detals ///
	    public String detals(@PathVariable("id") Long id, Model model) {
	    	  Celebrity Celebrity = CelebrityService.findCelebrity(id);
	          model.addAttribute("Celebrity", Celebrity);
	          return "detals.jsp";
	    }
	 
}