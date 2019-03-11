package com.leonardofsm.helpdesk.api.security.jwt;

import java.util.List;
import com.leonardofsm.helpdesk.api.entity.User;

import org.springframework.security.core.GrantedAuthority;

public class JwtUserFactory {
	
	private JwtUserFactory() {
	}
	
	public static JwtUser create(User user) {
		return new JwtUser(user.getId(),user.getEmail(),user.getPassword(),
				mapToGrantedAuthorities(user.getProfile()));
	}

}
