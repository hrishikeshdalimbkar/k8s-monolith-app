package com.cybage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.UserRepository;
import com.cybage.model.UserEntity;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<UserEntity> addUsers(List<UserEntity> userList) {
		return userRepository.saveAll(userList);
	}

	@Override
	public List<UserEntity> getUsersList() {
		return userRepository.findAll();
	}

}
