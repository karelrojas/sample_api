package com.krojas.sample.api.members;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class SecurityGuard extends Security {


	private String zone;

	public SecurityGuard() {
		
	}
	
	public SecurityGuard(Integer id, String firstName, String lastName, LocalDate birthDate, String zone) {
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
	
	
}
