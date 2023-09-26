package com.springBoot.WebGames.security.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springBoot.WebGames.hibernate.dao.AuthorityDAO;
import com.springBoot.WebGames.hibernate.entity.Role;
import com.springBoot.WebGames.hibernate.entity.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthorityDAO authDAO;
	
	@Autowired
	public CustomUserDetailsService(UserRepository userRepository) {
		
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final User user = userRepository.findByUsername(username);
		final Collection<Role> roles = authDAO.getRoles(username);
		List<SimpleGrantedAuthority> updatedAuthorities = new ArrayList<SimpleGrantedAuthority>();
		
		
		for (Role role : roles) {
			SimpleGrantedAuthority roleAuthority = new SimpleGrantedAuthority(role.getAuthority());
			updatedAuthorities.add(roleAuthority);
		}
		
		
		if(user == null) {
			throw new UsernameNotFoundException(username);
		}
		UserDetails userA = org.springframework.security.core.userdetails.
				User.withUsername(user.getUsername()).password(user.getPassword()).authorities(updatedAuthorities).build();

		return userA;
	}

}












