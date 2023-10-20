package com.learnwithtechguru.restservices.sbbuildingblocks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learnwithtechguru.restservices.sbbuildingblocks.Service.UserService;
import com.learnwithtechguru.restservices.sbbuildingblocks.entities.Users;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/allusers")
	public List<Users> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("createuser")
	public Users createUser(@RequestBody Users user) {
		return userService.createUser(user);
	}
	
	@PostMapping("users/{id}")
	public Optional<Users> getUsersbyId(@PathVariable("id") Long id) {
		return userService.getUser(id);
	}
	
	@PutMapping("users/{id}")
	public Users updateUserById(@PathVariable("id") Long id, @RequestBody Users user) {
		return userService.updateUserById(id, user);
	}
	
	@DeleteMapping("users/{id}")
	public void deleteUserById(@PathVariable("id") Long id) {
		userService.deleteUserById(id);	
	}
	
	@PostMapping("users/byuser/{username}")
	public Users getUserByUsername(@PathVariable("username") String username) {
	     return userService.getUserByUsername(username);
	}
	
	
}
