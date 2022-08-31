package com.niggas.rest.webservices.restfulwebservices.world;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class WorldController {
	
	private MessageSource messageSource;
	public WorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello, Welcome ";
	}
	
	@GetMapping(path = "/hello-world-fuka")
	public  helloWorldFuka helloWorldFuka() {
		return new helloWorldFuka("Hello, what are you giving?");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public helloWorldFuka helloWorldPathVariable(@PathVariable String name) {
		return new helloWorldFuka(String.format("Hello, what are you giving?, I AM VARIABLE, %s", name));
	}
	
	@GetMapping(path = "/hello-world/i18d")
	public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null,"Default Message", locale);
		//return "Hello Welcome, RPTMD";
	}
}
