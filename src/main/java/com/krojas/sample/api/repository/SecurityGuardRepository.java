package com.krojas.sample.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krojas.sample.api.members.SecurityGuard;

public interface SecurityGuardRepository extends JpaRepository<SecurityGuard, Integer>{

}
