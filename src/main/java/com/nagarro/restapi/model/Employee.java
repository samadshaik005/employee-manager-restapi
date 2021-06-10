package com.nagarro.restapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "employename")
	private String employename;

	@Column(name = "location")
	private String location;

	@Column(name = "email")
	private String email;

	@Column(name = "dateofbirth")
	private String dateofbirth;

	public Employee(long id, String employename, String location, String email, String dateofbirth) {
		super();
		this.id = id;
		this.employename = employename;
		this.location = location;
		this.email = email;
		this.dateofbirth = dateofbirth;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public String getEmployename() {
		return employename;
	}

	public void setEmployename(String employename) {
		this.employename = employename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public void setId(long id) {
		this.id = id;
	}

}
