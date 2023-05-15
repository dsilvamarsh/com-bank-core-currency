package com.bank.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bank.core.bean.Currency;
import com.bank.core.repository.CurrencyRepository;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
@EnableJdbcRepositories(basePackages = {"com.bank.core.repository"})
public class CurrencyController {

	
	@Autowired
	private CurrencyRepository repo;
	@GetMapping("/currency/{id}")
	public Currency findCurrency(@PathVariable int id){
		//log.debug("inside logging");
		log.debug("Inside controller fetching currency details for "+id);
		return repo.findById(id).get();
		
	}
	
	
	
	
}
