package com.springBoot.WebGames.hibernate.dao;

import java.util.Collection;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springBoot.WebGames.hibernate.entity.Role;

@Repository
public class AuthorityDAOImpl implements AuthorityDAO{

private EntityManager entityManager;
	
	@Autowired
	public AuthorityDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public Collection<Role> getRoles(String username) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Role> query = currentSession.createQuery("from Role a where a.username = :username", Role.class);
		query.setParameter("username", username);
		Collection<Role> roles = query.getResultList();
		
		return roles;
	}

}
