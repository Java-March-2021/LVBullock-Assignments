package com.lvbullock.registerlogin.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

//Be sure to check that your imports are coming from the correct library--looking for javax.persistence, anything else will cause errors

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=2, max=20, message="Minimum of 2 characters required for First Name")
	private String firstName;
	
	@NotBlank
	@Size(min=2, max=30, message="Minimum of 2 characters required for Last Name")
	private String lastName;
	
	@Email
	@NotBlank
	private String email;
	
	@NotBlank
	@Size(min=8, max=200, message="Minimum of 8 characters required for Password")
	private String password;
	
	@Transient  //to make confirmPassword part of the model, but not the database
	private String confirmPassword;
	
	//POJO - Empty Constructor  (Java Bean -- creates an empty object for the user to fill in and then stored into the database)
	public User() {
	}
	
	@Column(updatable=false)
	@DateTimeFormat(pattern = "MM-dd-YYYY HH:mm:ss")
	private Date createdAt;

	@DateTimeFormat(pattern = "MM-dd-YYYY HH:mm:ss")
	private Date updatedAt;
	
	@PrePersist //do this before anything -- Callback
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate //do this before anything
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	//Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
