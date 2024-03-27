package com.krojas.sample.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.krojas.sample.api.members.Vendor;
import com.krojas.sample.api.repository.VendorRepository;

@Service
public class VendorService {

	private VendorRepository vendorRepo;
	
	public VendorService(VendorRepository vendorRepo) {
		this.vendorRepo = vendorRepo;
	}
	
	
	public List<Vendor> getAllVendors() {
		return vendorRepo.findAll();
	}
	
	public Vendor getVendor(Integer id) {
		Optional<Vendor> vendor = vendorRepo.findById(id);
		// Implement not found exception
		
		return vendor.get();
	}
	
	public void addVendor(Vendor newVendor) {
		vendorRepo.save(newVendor);
	}
}
