package com.example.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	private int uid;
	private int age;
	private String username;
	private String password;
	public final int getUid() {
		return uid;
	}
	
	public User() {
	}

	public User(int uid, int age, String username, String password) {
		super();
		this.uid = uid;
		this.age = age;
		this.username = username;
		this.password = password;
	}

	public final void setUid(int uid) {
		this.uid = uid;
	}
	public final int getAge() {
		return age;
	}
	public final void setAge(int age) {
		this.age = age;
	}
	public final String getUsername() {
		return username;
	}
	public final void setUsername(String username) {
		this.username = username;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
}
