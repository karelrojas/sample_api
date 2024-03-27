package com.krojas.sample.api.service;

import java.util.List;

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
	
	public void addVendor(Vendor newVendor) {
		vendorRepo.save(newVendor);
	}
}
