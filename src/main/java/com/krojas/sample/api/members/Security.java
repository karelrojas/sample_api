package com.krojas.sample.api.members;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Security {

	@Id
	@GeneratedValue
	protected Integer id;
	@Column
	protected String firstName;
	@Column
	protected String lastName;
	@Column
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
