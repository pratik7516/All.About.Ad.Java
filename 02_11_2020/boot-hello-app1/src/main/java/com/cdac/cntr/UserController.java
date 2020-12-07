package com.cdac.cntr;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.User;

@RestController
public class UserController {
	
	@GetMapping(value = "hello")
	public String sayHello(@RequestParam String name) {
		return "Hello "+name;
	}
	
	@DeleteMapping(value = "del/{id}")
	public String deleteData(@PathVariable int id) {
		return "deleted "+id;
	}
	
	@PostMapping(value = "add")
	public User getUser(@RequestBody User user) {
		return user;
	}
	
}
