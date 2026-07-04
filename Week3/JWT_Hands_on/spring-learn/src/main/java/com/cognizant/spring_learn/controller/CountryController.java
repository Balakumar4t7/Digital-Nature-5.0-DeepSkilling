package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private static final Logger log = LoggerFactory.getLogger(CountryController.class);

    CountryService countryService;
    CountryController(CountryService countryService){
        this.countryService= countryService;
    }

    @GetMapping("/hello")
    public String helloWorld(){
        log.info("helloWorld() method Started ");
        return "Hello World";
    }

    @GetMapping("/country")
    public List<Country> getAllCountry(){
        log.info("getAllCountry() method Started  ");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries =(List<Country>) context.getBean("countryList");
        log.info("Loaded Country List from Country.xml file  ");
        log.debug("Country {} ",countries);
        return countries;
    }

    @GetMapping("/country/{code}")
    public Country getCountryByID(@PathVariable String code){
        Country country =countryService.getCountryByCode(code);
        log.debug("Country : {} ",country);
        return country;
    }
}
