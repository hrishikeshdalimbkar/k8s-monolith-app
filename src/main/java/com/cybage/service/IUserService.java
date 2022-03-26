package com.cybage.service;

import java.util.List;

import com.cybage.model.UserEntity;

public interface IUserService {
	List<UserEntity> addUsers(List<UserEntity> userList);

	List<UserEntity> getUsersList();
}
