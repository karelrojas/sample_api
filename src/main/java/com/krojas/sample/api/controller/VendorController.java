package com.krojas.sample.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krojas.sample.api.repository.VendorRepository;
import com.krojas.sample.api.service.VendorService;
import com.krojas.sample.api.vendors.Vendor;


@RestController
public class VendorController {
	
	
	private VendorService vendorService;
	
	public VendorController(VendorService vendorService) { 
		this.vendorService = vendorService; 
	}
	 
	
	@GetMapping(path = "/event/members/vendors")
	public List<Vendor> getVendors() {
		return vendorService.getAllVendors();
	}
	
	@PostMapping(path = "/event/members/vendors")
	public void addVendor(@RequestBody Vendor vendor) {
		vendorService.addVendor(vendor);
	}
	
	
	
}