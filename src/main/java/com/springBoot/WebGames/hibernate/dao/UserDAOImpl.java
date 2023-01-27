package com.springBoot.WebGames.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springBoot.WebGames.hibernate.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	private EntityManager entityManager;
	
	@Autowired
	public UserDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<User> getAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<User> query = currentSession.createQuery("from web_user", User.class);
		
		List<User> users = query.getResultList();
		
		return users;
	}

	@Override
	public User findById(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		User user = currentSession.get(User.class, id);
		
		return user;
	}
	
	@Override
	public User findByUsername(String username) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from User w where w.username = :username");
		query.setParameter("username", username);
		
		return (User) query.list().get(0);
	}

	@Override
	public void save(User user) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		// if id is 0 it will do an insert else it will update
		currentSession.saveOrUpdate(user);
	}

	@Override
	public void deleteById(int id) {

		Session currentSession = entityManager.unwrap(Session.class);
		
		Query query = currentSession.createQuery("delete from web_user where id=:id");
		query.setParameter("id",  id);
		query.executeUpdate();
	}

	

}
