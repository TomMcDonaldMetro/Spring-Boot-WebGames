package com.springBoot.WebGames.hibernate.dao;

import java.util.Collection;

import com.springBoot.WebGames.hibernate.entity.Role;

public interface AuthorityDAO {

	public Collection<Role> getRoles(String username);
	
}
