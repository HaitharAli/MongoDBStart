package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.MongoService;

@RestController
public class MongoController {

	@Autowired
	private MongoService mongoService;

	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody UserDto userDto) {
		User user = mongoService.addUser(userDto);
		return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
	}
}
