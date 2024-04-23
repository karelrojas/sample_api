package com.krojas.sample.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krojas.sample.api.members.SecurityOfficer;

public interface SecurityOfficerRepository extends JpaRepository<SecurityOfficer, Integer>{

}
