package com.jcg.jsp.el;

public class Candidate {
	
	private int id;
	private String name;
	private Address address;
	
	public Candidate(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Candidate() {
		
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address addressObj) {
		this.address = addressObj;
	}
	
	
	

}
