package com.javastack.spring.dikishi.controlles;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dakichi")
public class daikichicontroller {
	
	@RequestMapping("")
	public String dakishi() {
       return "welcome";
}

	@RequestMapping("/today")
	public String today() {
       return "today will find bla bla bla";
}
}