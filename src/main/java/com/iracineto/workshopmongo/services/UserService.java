package com.iracineto.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iracineto.workshopmongo.domain.User;
import com.iracineto.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	//injeção de dependencia automática
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
		
	}
}
