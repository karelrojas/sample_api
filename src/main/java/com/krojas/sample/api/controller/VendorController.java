package com.krojas.sample.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krojas.sample.api.members.Vendor;
import com.krojas.sample.api.service.VendorService;

@RequestMapping(path = "/event/members")
@RestController
public class VendorController {
	
	private VendorService vendorService;
	
	public VendorController(VendorService vendorService) { 
		this.vendorService = vendorService; 
	}
	
	@GetMapping("vendors")
	public List<Vendor> getVendors() {
		return vendorService.getAllVendors();
	}
	
	@GetMapping("vendors/{id}")
	public Vendor getVendor(@PathVariable Integer id) {
		return vendorService.getVendor(id);
	}
	
	@PostMapping("vendors")
	public void addVendor(@RequestBody Vendor vendor) {
		vendorService.addVendor(vendor);
	}
	
	@DeleteMapping("vendors/{id}")
	public void removeVendor(@PathVariable Integer id) {
		vendorService.deleteVendor(id);
	}
	
	
	
}