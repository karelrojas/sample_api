package com.krojas.sample.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krojas.sample.api.members.SecurityGuard;
import com.krojas.sample.api.members.SecurityOfficer;
import com.krojas.sample.api.service.SecurityOfficerService;

@RequestMapping(path = "/event/members")
@RestController
public class SecurityOfficerController {

	private SecurityOfficerService officerService;
	
	public SecurityOfficerController(SecurityOfficerService officerService) {
		this.officerService = officerService;
	}
	
	@GetMapping(path = "officers")
	public List<SecurityOfficer> getAllOfficers(){
		return officerService.getAllOfficers();
	}
	
	@GetMapping(path = "officers/{id}")
	public SecurityOfficer getOfficer(@PathVariable Integer id) {
		return officerService.getOfficer(id);
	}
	
	@PutMapping(path = "officers/{id}")
	public void addSubordinate(@PathVariable Integer id, @RequestBody SecurityGuard guard) {
		officerService.addSubordinate(id, guard);
	}
	
	@PostMapping(path = "officers")
	public void addOfficer(@RequestBody SecurityOfficer newOfficer) {
		officerService.addOfficer(newOfficer);
	}
	
	@DeleteMapping(path = "officers/{id}")
	public void removeOfficer(@PathVariable Integer id) {
		officerService.removeOfficer(id);
	}
	
}
