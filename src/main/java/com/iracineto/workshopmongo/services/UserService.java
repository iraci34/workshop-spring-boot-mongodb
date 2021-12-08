package com.iracineto.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iracineto.workshopmongo.domain.User;
import com.iracineto.workshopmongo.repository.UserRepository;
import com.iracineto.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	//injeção de dependencia automática
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();	
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
