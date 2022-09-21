package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.MongoServiceRepository;

@Service
public class MongoService {

	@Autowired
	private MongoServiceRepository mongoServiceRepository;

	public User addUser(UserDto userDto) {
		User userEntity = new User();
		userEntity.setId(userDto.getId());
		userEntity.setName(userDto.getName());
		userEntity.setPassword(userDto.getPassword());
		return mongoServiceRepository.save(userEntity);

	}

}
