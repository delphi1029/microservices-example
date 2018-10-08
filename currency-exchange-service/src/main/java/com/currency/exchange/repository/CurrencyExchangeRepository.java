package com.currency.exchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.exchange.bean.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long>{
	
	public ExchangeValue findByFromAndTo(String from, String to);

}
