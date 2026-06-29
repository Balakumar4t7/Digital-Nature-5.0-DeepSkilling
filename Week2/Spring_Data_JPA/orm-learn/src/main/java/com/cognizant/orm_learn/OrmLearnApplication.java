package com.cognizant.orm_learn;

import java.awt.geom.CubicCurve2D;
import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.List;

import org.slf4j.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

	 private static Logger log = LoggerFactory.getLogger(OrmLearnApplication.class);

	 private static CountryService countryService;
	
	 
	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(OrmLearnApplication.class, args);
		
		log.info("Inside main ! ");
		  countryService = context.getBean(CountryService.class);
		 
		  testGetAllCountries();
		  testGetCountryByCode();
		  testAddNewCountry();
		  testDeleteCountryByCode();
		  testUpdateCountryByCode();
	}
	
	public static void testGetAllCountries() {
		log.info("testGetAllCountries()  Started ");
		List <Country>  country= countryService.getAllCountries();
		log.debug("countries : {}",country);
		log.info("testGetAllCountries()) Ended");
	}
	
	public static void testGetCountryByCode() {
		log.info("testGetCountryByCode()  Started ");
		String  countryName= countryService.getCountryByCode("AF");
		log.debug("country : {}",countryName);
		log.info("testGetCountryByCode() Ended");
		
	}
	
	public static void testAddNewCountry() {
		log.info("testAddNewCountry()  Started ");
	
		 Country country = new Country();   
		    country.setCode("BF");
		    country.setName("Burkina Faso");
		    countryService.addNewCountry(country);
		log.debug("country : {}",country);
		log.info("testAddNewCountry() Ended");
		
	}
	public static void testDeleteCountryByCode() {
		log.info("testDeleteCountryByCode()  Started ");
		String code="BF";
		countryService.deleteByCode(code);
		log.info("Deleted Country Code {} ",code);
		log.info("testDeleteCountryByCode() Ended");
	}
	
	public static void testUpdateCountryByCode() {
		log.info("testUpdateCountryByCode() Started ");
		 Country updatedCountry = new Country();   
		 updatedCountry.setCode("BF");
		 updatedCountry.setName("Burkina Faso");
		String code="In";
		countryService.updateCountryByCode(code,updatedCountry);
		log.info("Updated countryCode {} to countryCode {}",code,updatedCountry.getCode());
	}

}
