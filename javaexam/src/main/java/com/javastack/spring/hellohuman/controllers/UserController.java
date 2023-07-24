package com.javastack.spring.hellohuman.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javastack.spring.hellohuman.models.Celebrity;
import com.javastack.spring.hellohuman.models.LoginUser;
import com.javastack.spring.hellohuman.models.User;
import com.javastack.spring.hellohuman.services.CelebrityService;
import com.javastack.spring.hellohuman.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {
	   @Autowired
	   private UserService userServ;
	   
	   @Autowired
	   private CelebrityService CelebrityService;
	   
	   
	   @GetMapping("/")
	   public String index(Model model) {
	       model.addAttribute("newUser", new User());
	       model.addAttribute("newLogin", new LoginUser());
	       return "regform.jsp";
	   }
	   
	   
	   
	   @PostMapping("/register")
	   public String register(@Valid @ModelAttribute("newUser") User newUser, 
	           BindingResult result, Model model, HttpSession session) {
	       userServ.register(newUser, result);
	       if(result.hasErrors()) {
	           model.addAttribute("newLogin", new LoginUser());
	           return "regform.jsp";
	       }
	       session.setAttribute("user_id", newUser.getId());
	       return "redirect:/welcome";
	   }
	   
	   @PostMapping("/login")
	   public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	           BindingResult result, Model model, HttpSession session) {
	       User user = userServ.login(newLogin, result);
	       if(result.hasErrors()) {
	           model.addAttribute("newUser", new User());
	           return "regform.jsp";
	       }
	       session.setAttribute("user_id", user.getId());
	       return "redirect:/welcome";
	   }
	   
	   @GetMapping("/logout")
	   public String logout(HttpSession session) { 
	           session.invalidate();
	           return "redirect:/";

	   }
	   
	   @GetMapping("/welcome")
	   public String home(Model model, HttpSession session) {
	       if (session.getAttribute("user_id") != null) {
	       Long user_id = (Long) session.getAttribute("user_id");
	       User thisUser = userServ.findUserById(user_id);
	       model.addAttribute("thisuser", thisUser);
	       
	       Iterable<Celebrity> celebrity = CelebrityService.allCelebrity();
			model.addAttribute("Celebrity",celebrity);
	      
			
			
	       return "welcome.jsp";
	   }
	       else {
	           return "redirect:/";
	       }
	   }
	   
	}

