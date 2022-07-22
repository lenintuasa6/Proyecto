package com.chat.repository;

import java.util.ArrayList;
import java.util.List;

import com.chat.dominio.User;

public class UserRepository {
	
	private List<User> users = new ArrayList<>();
	
	public UserRepository() {
		users.add(new User(1,"Galo","Pineida","galo","galo@email.com", "123","/img/foto.jpg"));
		users.add(new User(2,"Cesar","Vera", "cesar","cesarvera@email.com", "123","/img/negra-ico.jpg"));
		users.add(new User(4,"Lorena","Cruz","lorena","lore@emai.com", "123","/img/foto.jpg"));
		users.add(new User(5,"Lenin","Tuasa","lenin","lenin@emai.com", "123","/img/foto.jpg"));
		users.add(new User(6,"Madeline","Muñoz","madelein","madelein@emai.com", "123","/img/foto.jpg"));
		users.add(new User(7,"Jorge","Saltos","jorge","jorge@emai.com", "123","/img/foto.jpg"));
		users.add(new User(8,"Melany","Guerrero","melany","melany@emai.com", "123","/img/foto.jpg"));
		users.add(new User(9,"Allisson","Yoza","alisson","alisson@emai.com", "123","/img/foto.jpg"));
		users.add(new User(10,"Francisco","Sornoza","pancho","pancho@emai.com", "123","/img/foto.jpg"));
		users.add(new User(10,"Juan","Auria","juan","juan@emai.com", "123","/img/foto.jpg"));
		users.add(new User(10,"Camila","Perez","camila","camila@emai.com", "123","/img/foto.jpg"));
	}
	
	public User login(String userName, String password) {
		for(User user: users) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
				return user;
		}
		return null;
	}
	
	public User getUserById(int id) {
		for(User user: users) {
			if(user.getId() ==  id)
				return user;
		}
		return null;
	}
	
	public User getUserByUserName(String userName) {
		for(User user: users) {
			if(user.getUserName().equals(userName))
				return user;
		}
		return null;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	

}
