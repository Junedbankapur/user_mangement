package project.com.user.management.controller;

import org.springframework.web.bind.annotation.RestController;

import project.com.user.management.service.UsersService;

@RestController
public class UsersController {

	UsersService service;

	public UsersController(UsersService service) {
		super();
		this.service = service;
	}

	
	
	
}
