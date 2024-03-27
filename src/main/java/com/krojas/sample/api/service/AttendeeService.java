package com.krojas.sample.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.krojas.sample.api.members.Attendee;
import com.krojas.sample.api.repository.AttendeeRepository;

@Service
public class AttendeeService {

	private AttendeeRepository attendeeRepo;
	
	public AttendeeService(AttendeeRepository attendeeRepo) {
		this.attendeeRepo = attendeeRepo;
	}
	
	public List<Attendee> getAllAttendees() {
		return attendeeRepo.findAll();
	}
	
	public Attendee getAttendee(Integer id) {
		Optional<Attendee> current = attendeeRepo.findById(id);
		//if (current.isEmpty())
			//throw ResponseStatusException(HttpStatus.NOT_FOUND);
		
		return current.get();
	}
	
	public void addAttendee(Attendee newAttendee) {
		attendeeRepo.save(newAttendee);
	}
}
