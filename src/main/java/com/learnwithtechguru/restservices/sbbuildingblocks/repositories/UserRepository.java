package com.learnwithtechguru.restservices.sbbuildingblocks.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.learnwithtechguru.restservices.sbbuildingblocks.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	  Users findByUsername(String username);
	}