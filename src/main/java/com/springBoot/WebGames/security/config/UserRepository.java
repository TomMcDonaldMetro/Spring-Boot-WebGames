package com.springBoot.WebGames.security.config;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.WebGames.hibernate.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByUsername(String username);
}
