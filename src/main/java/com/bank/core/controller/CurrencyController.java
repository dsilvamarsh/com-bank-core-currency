package com.bank.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bank.core.bean.Currency;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
public class CurrencyController {

	@GetMapping("/currency/{code}")
	public ResponseEntity<Currency> findCurrency(@PathVariable String code){
		//log.debug("inside logging");
		log.debug("Inside controller fetching currency details for "+code);
		return ResponseEntity.status(HttpStatus.OK).body(Currency.builder().currencyName("United Kingdom")
				.charCode("GBP")
				.currencyName("Great Britan Pound").build());
		
		
	}
	
	
	
	
}
