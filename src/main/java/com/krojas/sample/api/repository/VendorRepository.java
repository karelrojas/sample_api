package com.krojas.sample.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krojas.sample.api.members.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
