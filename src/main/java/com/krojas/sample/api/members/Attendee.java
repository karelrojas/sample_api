package com.krojas.sample.api.members;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Attendee {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Size(min = 2, message = "Name must be at least two characters")
	private String firstName;
	@NotEmpty(message = "Must input last name")
	private String lastName;
	private LocalDate birthDate;
	
	public Attendee() {
		
	}
	
	public Attendee(Integer id, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

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

	@Override
	public String toString() {
		return "Attendee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ "]";
	}
	
	
	
	
	
}
