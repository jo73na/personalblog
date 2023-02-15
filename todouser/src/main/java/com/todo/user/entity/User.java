package com.todo.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	int userId;

	@Column(name = "username", nullable = false)
	String name;
	
	@Column(name = "emailid", nullable = false)
	String emailid;
	
	@Column(name = "password", nullable = false)
	String password;

	

	public User(int userId, String name, String emailid, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailid=emailid;
		this.password=password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	
	
	/*
	 * public String getPassword() { return password; }
	 * 
	 * public void setPassword(String password) { this.password = password; }
	 */

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", emailid=" + emailid + "]";
	}

	
	
	

}
