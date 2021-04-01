package com.lvbullock.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="languages")
public class Language {
	//Generating the database
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //automatically generate id and increment by 1
	//Language Attributes
	private Long id;  //primary key, always want to be Long
	
	@Size(min=2, max=20, message="**Required field between 2 and 20 characters**") //for strings
	private String name;
	
	@Size(min=2, max=20, message="**Required field between 2 and 20 characters**") //for strings
	private String creator;
	
	@NotBlank
	private String currentVersion;


	
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
	
	//POJO - Empty Constructor  (Java Bean -- creates an empty object for the user to fill in and then stored into the database)
	public Language() {
	}
	
	
	public Language(String name, String creator, String currentVersion) {
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
	}
	
	// GETTERS AND SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
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
