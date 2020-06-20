package com.dipali.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipali.modal.User;
import com.dipali.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	 UserRepository userRepository;
	
	
	public void saveMyUser(User user ) {
		userRepository.save(user);
	}
	

	public List<User> showAllUsers(){
		List<User> users = new ArrayList<User>();
		for(User user : userRepository.findAll()) {
			users.add(user);
		}
		
		return users;
	}
	
	
	public User findByUsernameAndPassword(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}
	
	}

	