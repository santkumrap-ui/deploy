package com.practice.deploy.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Data
public class Deploy {

	private Integer id;
	private String name;
	private String location;
	
	public Deploy(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.location=string2;
		this.name=string;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
