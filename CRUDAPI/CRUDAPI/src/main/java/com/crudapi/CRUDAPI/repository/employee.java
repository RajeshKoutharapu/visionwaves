package com.crudapi.CRUDAPI.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {
	
	@Id
	Integer id;
	String firstname;
	String lastname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirst_name() {
		return firstname;
	}
	public void setFirst_name(String first_name) {
		this.firstname = first_name;
	}
	public String getLast_name() {
		return lastname;
	}
	public void setLast_name(String last_name) {
		this.lastname = last_name;
	}
	
 
}
