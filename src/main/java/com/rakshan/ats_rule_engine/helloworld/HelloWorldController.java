package com.rakshan.ats_rule_engine.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
//	public String helloWorld() {
//		return "HelloWorld!";
//	}
	@GetMapping("/hello-world")
	public String helloWorld() {
	    return "HelloWorld!";
	}

}
