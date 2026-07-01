package com.cognizant.orm_learn.service;

import java.lang.invoke.StringConcatFactory;
import java.util.List;

import org.hibernate.internal.find.FindByKeyOperation;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

@Service
public class CountryService {
	
	CountryRepository countryRepository ;
	public CountryService(CountryRepository countryRepository ) {
		this.countryRepository=countryRepository;
	}
	
	public List<Country> getAllCountries(){
		return countryRepository.findAll();
	}
	
	public String getCountryByCode(String code) {
		 Country country = countryRepository .findById(code).orElseThrow(()->new RuntimeException("Country Not Found"));
		 return country.getName();
	}
	
	public void addNewCountry(Country country) {
		
		countryRepository.save(country);
		
	}
	
	public void deleteByCode(String code) {
		
		Country country = countryRepository.findById(code).orElseThrow(()-> new RuntimeException("Country not found "));
		countryRepository.delete(country);
	}
	
	public void updateCountryByCode(String code, Country updatedCountry) {
		

		Country country = countryRepository.findById(code).orElseThrow(()-> new RuntimeException("Country not found Create one for updation"));
		country.setName(updatedCountry.getName());
		countryRepository.save(country);
		
	}
	
	public List<Country> getCountryByWord(String word) {
		 return countryRepository.getAllCountryMatchesWords(word);
	}

}
