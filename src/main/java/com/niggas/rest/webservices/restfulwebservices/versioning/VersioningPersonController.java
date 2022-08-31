package com.niggas.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Charp M Robert");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecoundVersionOfPerson() {
		return new PersonV2(new Name("Robert", "Charp M"));
	}
	
	@GetMapping(path="/person", params = "version=1")
	public PersonV1 getFirstVersionOfPersonRequestParameter() {
		return new PersonV1("Charp M Robert");
	}
	
	@GetMapping(path="/person", params = "version=2")
	public PersonV2 getSecoundVersionOfPersonRequestParameter() {
		return new PersonV2(new Name ("Robert", "Charp M"));
	}
	
	@GetMapping(path="/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstVersionOfPersonRequestHeader() {
		return new PersonV1("Charp M Robert");
	}
	
	@GetMapping(path="/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getSecoundVersionOfPersonRequestHeader() {
		return new PersonV2(new Name ("Robert", "Charp M"));
	}

	@GetMapping(path="/person/accept", produces = "application/vpn.niggasnaions.app-callme+json")
	public PersonV2 getSecoundVersionOfPersonRequestAccept() {
		return new PersonV2(new Name ("Robert", "Charp M"));
	}
}
