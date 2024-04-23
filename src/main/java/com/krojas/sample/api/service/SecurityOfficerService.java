package com.krojas.sample.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.krojas.sample.api.members.SecurityOfficer;
import com.krojas.sample.api.repository.SecurityOfficerRepository;

@Service
public class SecurityOfficerService {

	private SecurityOfficerRepository officerRepo;
	
	public SecurityOfficerService(SecurityOfficerRepository officerRepo) {
		this.officerRepo = officerRepo;
	}
	
	public List<SecurityOfficer> getAllOfficers() {
		return officerRepo.findAll();
		}
	
	public SecurityOfficer getOfficer(Integer id) {
		Optional<SecurityOfficer> officer = officerRepo.findById(id);
		return officer.get();
	}
	
	public void addOfficer(SecurityOfficer officer) {
		// Check if officer exists in zone (only one officer per zone)
		officerRepo.save(officer);
	}
	
	public void removeOfficer(Integer id) {
		officerRepo.deleteById(id);
	}
	
}
