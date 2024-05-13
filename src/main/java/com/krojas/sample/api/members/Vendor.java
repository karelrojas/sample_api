package com.krojas.sample.api.members;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Vendor {

	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private String vendorName;
	private LocalDate birthDate;
	private List<String> tags;
	
	public Vendor() {
		
	}
	
	public Vendor(Integer id, String firstName, String lastName, String vendorName, LocalDate birthDate, List<String> tags) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.vendorName = vendorName;
		this.birthDate = birthDate;
		this.tags = tags;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", firstName=" + firstName + "]";
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	
	
	
}
