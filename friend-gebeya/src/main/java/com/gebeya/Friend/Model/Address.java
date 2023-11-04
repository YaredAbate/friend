package com.gebeya.Friend.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String street;
	private String city;
	//@ManyToOne(cascade=CascadeType.ALL,fetch =FetchType.LAZY)


	public Address() {
		super();
	}

	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + "]";
	}

}
