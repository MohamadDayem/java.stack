package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Daka {
    @RequestMapping("/daikichi/travel/{citys}")
    public String showLesson(@PathVariable("citys")String citys){
    	
    	return "Congratulations! You will soon travel to "+citys;
    }
}