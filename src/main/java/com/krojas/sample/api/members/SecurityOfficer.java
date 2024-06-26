package com.krojas.sample.api.members;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class SecurityOfficer extends Security{

	@OneToMany
	private List<SecurityGuard> subordinates;
	
	public SecurityOfficer( ) {
		
	}
	
	public SecurityOfficer(Integer id, String firstName, String lastName, LocalDate birthDate, String zone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.zone = zone;
	}

	public List<SecurityGuard> getSubordinates() {
		return subordinates;
	}
	
	public void setSubordinate(SecurityGuard guard) {
		subordinates.add(guard);
	}

	@Override
	public String toString() {
		return "SecurityOfficer [subordinates=" + subordinates + ", id=" + id + 
				", lastName=" + lastName + ", zone=" + zone + "]";
	}
	
	
	
	
	
	
	
}
