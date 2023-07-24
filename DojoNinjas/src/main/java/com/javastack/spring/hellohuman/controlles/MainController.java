package com.javastack.spring.hellohuman.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javastack.spring.hellohuman.models.dojos;
import com.javastack.spring.hellohuman.models.ninjas;
import com.javastack.spring.hellohuman.services.dojosService;
import com.javastack.spring.hellohuman.services.ninjasService;

import jakarta.validation.Valid;

@Controller
public class MainController {
  private final dojosService dojoService;
  private final ninjasService ninjasService;
  
  public MainController(dojosService dojoService ,ninjasService ninjasService) {
	  
	  this.dojoService=dojoService;
	  this.ninjasService= ninjasService;
  }
  
  @GetMapping("/")
  public String index(@ModelAttribute("dojos") dojos dojos) {
	  return "NewFile.jsp";
  }
  
  
  @PostMapping("/adddojos")
  public String home (@Valid@ModelAttribute("dojos")dojos dojos,BindingResult result, Model model) {
  	if(result.hasErrors()) {
		return "NewFile.jsp";
	}else {
		 dojoService.creatdojos(dojos);
	      return "redirect:/";
	}
  }
  
  @GetMapping("/new")
  public String newninja(@ModelAttribute ("ninjas")ninjas ninjas,Model model ) {
	  model.addAttribute("dojos", dojoService.alldojos());
	  return "newninja.jsp";
	  
  }
  @PostMapping("/ninjasadd")  // form creat\\
  public String home (@Valid @ModelAttribute("ninjas")ninjas ninjas,BindingResult result, Model model) {
  	if(result.hasErrors()) {
		return "newninja.jsp";
	}else {
		ninjasService.creatninjas(ninjas);
	      return "redirect:/";
	}
  
  }
}