package com.siva.spring.cassandra.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;

public class User {
	@PrimaryKey
	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	/**
	 * @param id
	 * @param name
	 * @param address
	 * @param age
	 */
	public User(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.age = age;
	}
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;

	private String Address;
	private int age;

}
