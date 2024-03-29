package com.krojas.sample.api.members;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SecurityOfficer extends Security{

	private String zone;
	@JsonIgnore
	private List<SecurityGuard> subordinates;
	
	public SecurityOfficer(Integer id, String firstName, String lastName, LocalDate birthDate, String zone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.zone = zone;
	}

	public String getZone() {
		return zone;
	}

	public List<SecurityGuard> getSubordinates() {
		return subordinates;
	}
	
	
	
	
	
}