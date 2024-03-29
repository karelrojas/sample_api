package com.krojas.sample.api.members;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Security {

	@Id
	@GeneratedValue
	protected Integer id;
	protected String firstName;
	protected String lastName;
	protected LocalDate birthDate;
	
	public Integer getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
}
