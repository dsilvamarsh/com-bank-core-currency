package com.bank.core.repository;

import org.springframework.data.repository.CrudRepository;

import com.bank.core.bean.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

}
