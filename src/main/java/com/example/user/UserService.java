package com.example.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	public void save(User user) {
		userRepo.save(user);
	}
	
	

}
