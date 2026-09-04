package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calci {
	
	@GetMapping("calci/add/{a}/{b}/{c}")
    int add(@PathVariable int a, @PathVariable int b, @PathVariable int c)
	{
		
		return a+b+c;
		
	}
	
	@GetMapping("calci/sub/{a}/{b}/{c}")
	int sub(@PathVariable int a ,@PathVariable int b, @PathVariable int c)
	{
		
		return a-b-c;
		
	}
	
	@GetMapping("calci/mul/{a}/{b}/{c}")
	int mul(@PathVariable int a, @PathVariable int b, @PathVariable int c)
	{
		
		return a*b*c;
		
	}
	
	@GetMapping("calci/div/{a}/{b}/{c}")
	int div(@PathVariable int a, @PathVariable int b,@PathVariable int c)
	{
		
		return a/b/c;
	}

}
