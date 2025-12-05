package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.deploy.Entity.Deploy;
import com.practice.service.Deployservice;

@RestController
@RequestMapping("/dd")
public class Deploycontroller {

	@Autowired
	
	private Deployservice deployservice;
	
	@GetMapping("/all")
	public ResponseEntity<List<Deploy>> getAllDeploys(){
		
		List<Deploy> deploys= deployservice.getAlldeploys();
		
		return new ResponseEntity<>(deploys, HttpStatus.OK);
		
		
	}
}
