package com.krojas.sample.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krojas.sample.api.members.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, Integer>{

}
