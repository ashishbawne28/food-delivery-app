package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


	@GetMapping("cal/{a}/{b}/{type}")
	public int calcy(@PathVariable int a,@PathVariable int b,@PathVariable String type){
		
		if(type.equals("add")){
			return a+b;
		}
		if(type.equals("sub")) {
			return a-b;
		}
		
		if(type.equals("mul")) {
			return a*b;
		}
		
		if(type.equals("div")) {
			return a/b;
		}
		return 0;
		
		
		
		


		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
