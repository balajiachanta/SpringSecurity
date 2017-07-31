package com.bala.security;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "user_prof")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_id")
	private String userId;


	@Column(name = "user_pswd_txt")
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {

	}

	public User(User user) {
		this.userId = user.userId;

		this.password = user.password;

	}

	public String getUserName() {
		// TODO Auto-generated method stub
		return String.valueOf(getUserId());
	}

}