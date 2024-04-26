package com.krojas.sample.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.krojas.sample.api.members.SecurityGuard;
import com.krojas.sample.api.members.SecurityOfficer;
import com.krojas.sample.api.repository.SecurityGuardRepository;
import com.krojas.sample.api.repository.SecurityOfficerRepository;

@Service
public class SecurityOfficerService {

	private SecurityOfficerRepository officerRepo;
	private SecurityGuardRepository guardRepo;
	
	public SecurityOfficerService(SecurityOfficerRepository officerRepo, SecurityGuardRepository guardRepo) {
		this.officerRepo = officerRepo;
		this.guardRepo = guardRepo;
	}
	
	public List<SecurityOfficer> getAllOfficers() {
		return officerRepo.findAll();
		}
	
	public SecurityOfficer getOfficer(Integer id) {
		Optional<SecurityOfficer> officer = officerRepo.findById(id);
		return officer.get();
	}
	
	public void addSubordinate(Integer id, SecurityGuard guard) {
		Optional<SecurityOfficer> officer = officerRepo.findById(id);
		Optional<SecurityGuard> newGuard = guardRepo.findById(guard.getId());
		officer.get().setSubordinate(newGuard.get());
		officerRepo.save(officer.get());
	}
	
	public void addOfficer(SecurityOfficer officer) {
		// Check if officer exists in zone (only one officer per zone)
		officerRepo.save(officer);
	}
	
	public void removeOfficer(Integer id) {
		officerRepo.deleteById(id);
	}
	
}
