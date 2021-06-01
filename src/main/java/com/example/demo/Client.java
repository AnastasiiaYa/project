package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
public class Client {
	private String id;
	private String name;
	private String surname;
	private String dateOfBitrh;
	
	public Client() {}
	
	public Client(String id, String name, String surname, String dateOfBirth)
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dateOfBitrh = dateOfBirth;
	}
	public String getId() { return id; }
	public void setId (String id) { this.id = id; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getSurname() {return surname; }
	public void setSurname(String surname) { this.surname = surname; }
	
	public String getDateOfBirth() {return dateOfBitrh; }
	public void setDateOfBirth(String dateOfBirth) { this.dateOfBitrh = dateOfBirth; }
}
