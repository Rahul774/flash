package org.kaushik.javabrains.service;

import java.util.HashMap;

import org.kaushik.javabrains.dto.User;

public class LoginService {
	HashMap<String, String> users=new HashMap<String, String>();
	
	public LoginService() {
		users.put("johndoe","Jhon Doe");
		users.put("jahedoe","Jhon Doe");
		users.put("jguru","Java Guru");
	}
	public boolean authenticate(String userId,String password) {
		if(password==null|| password.trim()=="")
		{return false;}
return true;
	}
	public User getUserDetails(String userId) {
		User user=new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
}
}