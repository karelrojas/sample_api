package com.krojas.sample.api.members;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class SecurityGuard extends Security {

	@ManyToOne
	private SecurityOfficer officer;

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
	
	public SecurityOfficer getOfficer() {
		return officer;
	}
	
	
}
