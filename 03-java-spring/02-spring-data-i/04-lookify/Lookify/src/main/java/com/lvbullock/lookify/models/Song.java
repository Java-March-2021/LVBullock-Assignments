package com.lvbullock.lookify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="songs")
public class Song {

	//Generating the database
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //automatically generate id and increment by 1
	//Song Attributes
	private Long id;  //primary key, always want to be Long
	
	@Size(min=2, max=50, message="**Required field between 2 and 20 characters**") //for strings
	private String title;
	
	@Size(min=2, max=50, message="**Required field between 2 and 20 characters**") //for strings
	private String artist;
	
	@NotNull
	@Min(1)
	@Max(10)
	private int rating;


	
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
	public Song() {
	}
	
	//Contructor Overload
	public Song(long id, String title, String artist, int rating) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
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
