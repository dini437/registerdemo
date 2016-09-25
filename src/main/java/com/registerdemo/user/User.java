package com.registerdemo.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int Id;
	private String Username;
	private String Email;
	private String Phone;
	private String Location;
	private String Password;
	@Transient
	private String CPassword;
	private int Role=1;
	private boolean Active=true;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCPassword() {
		return CPassword;
	}
	public void setCPassword(String cPassword) {
		CPassword = cPassword;
	}
	public int getRole() {
		return Role;
	}
	public void setRole(int role) {
		Role = role;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}
	

	@Override
	public String toString(){
		return "{ID:\"" + Id + "\", Email:\"" + Email + "\", Username:\"" + Username + "\", Phone:\"" + Phone + "\", Location:\""
				+ Location + "\", Role:\"" + Role + "\", Active:" + Active + ", Delete: false}";
	
	}
}