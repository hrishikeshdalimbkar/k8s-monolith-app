package com.cybage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
