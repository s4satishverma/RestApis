package com.learnwithtechguru.restservices.sbbuildingblocks.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnwithtechguru.restservices.sbbuildingblocks.entities.Users;
import com.learnwithtechguru.restservices.sbbuildingblocks.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<Users> getAllUsers(){
		return userRepo.findAll();
	}
	
	public Users createUser(Users user) {
		return userRepo.save(user);
	}
	
	public Optional<Users> getUser(Long id) {
		return userRepo.findById(id);
	}

	public Users updateUserById(Long id, Users user) {
		user.setId(id);
		return userRepo.save(user);
	}
	
	public void deleteUserById(Long id) {
		if(userRepo.findById(id).isPresent()) {
			 userRepo.deleteById(id);	
		}
	}
	
	public Users getUserByUsername(String username) {
	     return userRepo.findByUsername(username);
	}
	
	
}
