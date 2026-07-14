package com.cognizant.springlearn.service;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.cognizant.springlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CountryService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);

    public Country getCountry(String code) {

        LOGGER.info("Searching for country code: {}", code);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList =
                context.getBean("countryList", List.class);

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {

                context.close();
                return country;
            }
        }

        context.close();
        LOGGER.info("Country found");
        return null;
    }
}