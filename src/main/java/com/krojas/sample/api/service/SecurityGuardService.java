package com.krojas.sample.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.krojas.sample.api.members.SecurityGuard;
import com.krojas.sample.api.members.SecurityOfficer;
import com.krojas.sample.api.repository.SecurityGuardRepository;
import com.krojas.sample.api.repository.SecurityOfficerRepository;

@Service
public class SecurityGuardService {

	private SecurityGuardRepository securityGuardRepo;
	
	public SecurityGuardService(SecurityGuardRepository securityGuardRepo) {
		this.securityGuardRepo = securityGuardRepo;
	}
	
	public List<SecurityGuard> getAllGuards(){
		return securityGuardRepo.findAll();
	}
	
	public SecurityGuard getGuard(Integer id) {
		Optional<SecurityGuard> guard = securityGuardRepo.findById(id);
		System.out.println(guard.get());
		// check if guard exists
		
		return guard.get();
	}
	
	public void addGuard(SecurityGuard guard) {
		securityGuardRepo.save(guard);
	}
	
	public void removeGuard(Integer id) {
		securityGuardRepo.deleteById(id);
	}
	
}
