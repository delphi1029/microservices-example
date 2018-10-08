package com.currency.exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.exchange.bean.ExchangeValue;
import com.currency.exchange.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchangeValue reterive(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue result = repository.findByFromAndTo(from, to);
		result.setPort(Integer.parseInt(environment.getProperty("server.port")));
		
		logger.info("result -> {}",result);
		
		return result;
	}

}