package com.pilot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Admin
 * @Since 18 thg 4, 2023
 * 
 */
@Entity
@Table(name = "USER")
public class UserInfoEntity {
    @Id
    @Column(name = "USERNAME", nullable = false)
	private String username;
    @Column(name = "PASSWORD", nullable = true)
	private String password;
    @Column(name = "ROLE", nullable = true)
	private String userRole;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userRole
	 */
	public String getUserRole() {
		return userRole;
	}

	/**
	 * @param userRole the userRole to set
	 */
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}