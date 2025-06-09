package com.crudop.basicCRUDOperations.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class tablets {

	@Id
	Integer id;
	String name;
	Integer price;
	String weight;
	public tablets() {
		
	}
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "tablets [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}
	public tablets(Integer id, String name, Integer price, String weight) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
}

