package com.springBoot.WebGames.hibernate.dao;

import java.util.List;

import com.springBoot.WebGames.hibernate.entity.User;

public interface UserDAO {

	public List<User> getAll();
	
	public User findById(int id);
	
	public void save(User user);
	
	//public void editUser(User user);
	
	public void deleteById(int id);
}
