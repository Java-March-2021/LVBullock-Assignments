package com.lvbullock.licenses.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Future;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")
public class License {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//License Attributes
	private Long id;
	
	private Integer licenseNumber;
	
	@Future
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expirationDate;
	private String state;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern = "MM/dd/YYYY HH:mm:ss")
	private Date createdAt;

	@DateTimeFormat(pattern = "MM/dd/YYYY HH:mm:ss")
	private Date updatedAt;
	
	@PrePersist //do this before anything -- Callback
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate //do this before anything
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;
	
	//POJO - Empty Constructor  (Java Bean -- creates an empty object for the user to fill in and then stored into the database)

	public License() {	
	}
	
	//Constructor Overload
	public License(long id, Integer licenseNumber, Date expirationDate, String state) {
		this.id = id;
		this.licenseNumber = licenseNumber;
		this.expirationDate = expirationDate;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(Integer licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
