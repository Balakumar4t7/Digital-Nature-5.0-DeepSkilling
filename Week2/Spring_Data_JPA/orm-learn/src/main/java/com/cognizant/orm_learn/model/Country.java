package com.cognizant.orm_learn.model;



import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	
	
	@Id
	@Column(name = "code")
	private String code;
	
	
	@Column(name="name")
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Country(){
		
	}
	@Override
	public String toString() {
		return "Country { Name : "+name +" , Code : "+code+ " }";
	}
	
	public Country(String name, String code) {
		this.code=code;
		this.name=name;
	}

}
