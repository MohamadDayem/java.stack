package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HopperAssigmnetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HopperAssigmnetsApplication.class, args);
	}
	@Controller
	public class MainController {
	    @RequestMapping("/")
	    public String showLesson(){
	    	return "index.jsp";
	    }
	}
}
