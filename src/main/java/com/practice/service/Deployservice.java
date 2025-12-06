package com.practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.deploy.Entity.Deploy;

@Service
public class Deployservice {

	
	

	public List<Deploy> getAlldeploys() {
		return List.of(new Deploy(101, "santosh", "Telangana"),
		        new Deploy(102, "kumar", "kerala"),
		        new Deploy(103, "raparthi", "bihar"),
		        new Deploy(103, "raparthi", "bihariiii"));

	
}}
