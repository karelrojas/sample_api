package com.krojas.sample.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krojas.sample.api.members.Attendee;
import com.krojas.sample.api.service.AttendeeService;

@RestController
public class AttendeeController {

	private AttendeeService attendeeService;
	
	public AttendeeController(AttendeeService attendeeService) {
		this.attendeeService = attendeeService;
	}
	
	@GetMapping(path = "/event/members/attendees")
	public List<Attendee> getAttendees(){
		return attendeeService.getAllAttendees();
				
	}
	
	@GetMapping(path = "/event/members/attendees/{id}")
	public Attendee getAttendee(@PathVariable Integer id) {
		return attendeeService.getAttendee(id);
	}
	
	@PostMapping(path = "/event/members/attendees")
	public void addAttendee(@RequestBody Attendee newAttendee) {
		attendeeService.addAttendee(newAttendee);
	}
}
