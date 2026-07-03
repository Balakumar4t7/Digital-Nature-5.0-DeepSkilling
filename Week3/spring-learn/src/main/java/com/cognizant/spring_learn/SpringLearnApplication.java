package com.cognizant.spring_learn;

import com.cognizant.spring_learn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication

public class SpringLearnApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringLearnApplication.class);
    private  static Country country;
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        country = context.getBean(Country.class);
        displayCountry();
	}

    public static void displayCountry(){
        log.info("Display method  from main is Started");
        log.debug("Country {}" ,country);
        log.info("Country Displayed and Existing form Dispaly method");
    }

}
