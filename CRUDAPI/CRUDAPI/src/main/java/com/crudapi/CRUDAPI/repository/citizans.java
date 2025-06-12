package com.crudapi.CRUDAPI.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class citizans {
	
	@Id
	Integer id;
	String name;
	String housenum;
    String address;
    String city;
    Integer pincode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHousenum() {
		return housenum;
	}
	public void setHousenum(String housenum) {
		this.housenum = housenum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
    
 
}
