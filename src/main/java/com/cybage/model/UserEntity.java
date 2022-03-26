package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {

	@Id
	private Integer userId;
	private String name;

	public UserEntity() {
		super();
	}

	public UserEntity(Integer userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", name=" + name + "]";
	}

}
