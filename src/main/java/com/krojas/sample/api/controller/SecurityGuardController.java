package com.krojas.sample.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.krojas.sample.api.service.SecurityGuardService;

@RequestMapping(path = "/event/members")
@RestController
public class SecurityGuardController {
	
	private SecurityGuardService guardService;
	
	public SecurityGuardController(SecurityGuardService guardService) {
		this.guardService = guardService;
	}

	@GetMapping("guards")
	public List<SecurityGuard> getAllGuards(){
		return guardService.getAllGuards();
	}
	
	@GetMapping("guards/{id}")
	public SecurityGuard getGuard(@PathVariable Integer id) {
		return guardService.getGuard(id);
	}
	
	@PostMapping("guards")
	public void addGuard(@RequestBody SecurityGuard newGuard) {
		guardService.addGuard(newGuard);
	}
	
	@DeleteMapping("guards/{id}")
	public void removeGuard(@PathVariable Integer id) {
		guardService.removeGuard(id);
	}
	
}
