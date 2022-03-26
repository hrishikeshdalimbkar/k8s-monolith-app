package com.cybage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.UserEntity;
import com.cybage.service.IUserService;
import com.github.javafaker.Faker;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	IUserService userService;

	@GetMapping("/")
	public ResponseEntity<List<UserEntity>> getUsersList() {
		List<UserEntity> userList = userService.getUsersList();
		if (userList.isEmpty())
			return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
		return new ResponseEntity<>(userService.getUsersList(), HttpStatus.OK);
	}

	@GetMapping("/add")
	public ResponseEntity<List<UserEntity>> addUsers() {
		Faker faker = new Faker();

		List<UserEntity> userList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			UserEntity userEntity = new UserEntity(i + 1, faker.name().fullName());
			userList.add(userEntity);
		}

		return new ResponseEntity<>(userService.addUsers(userList), HttpStatus.OK);
	}
}
