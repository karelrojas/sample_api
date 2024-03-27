package com.krojas.sample.api.vendors;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Vendor {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private List<String> tags;
	
	public Vendor() {
		
	}
	
	public Vendor(Integer id, String name, List<String> tags) {
		super();
		this.id = id;
		this.name = name;
		this.tags = tags;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", tags=" + tags + "]";
	}
	
	
	
	
}
