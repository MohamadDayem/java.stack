package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellohuman {
    @RequestMapping("/")
 
public String HELLO(@RequestParam(value="name",required=false)String name) {
    	
    	if (name!=null) {
    		return"hello"+name;
    	}
    	
    	
    	return"hellohuman";
}
}