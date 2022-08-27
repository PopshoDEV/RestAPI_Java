package com.niggas.rest.webservices.restfulwebservices.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class WorldController {
	
	//"Hello World"
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello Motherfuka";
	}
	
	//
	@GetMapping(path = "/hello-world-fuka")
	public  helloWorldFuka helloWorldFuka() {
		return new helloWorldFuka("Hello sorry bro, next and war for life you");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public helloWorldFuka helloWorldPathVariable(@PathVariable String name) {
		return new helloWorldFuka(String.format("Hello sorry bro, next and war for life you, I AM VARIABLE, %s", name));
	}
}
