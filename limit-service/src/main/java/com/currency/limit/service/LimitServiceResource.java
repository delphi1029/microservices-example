package com.currency.limit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import com.currency.limit.service.bean.LimitServiceConfiguration;
import com.currency.limit.service.configuration.Configuration;

@RefreshScope
@RestController
public class LimitServiceResource {
	
	@Autowired
	private Configuration configuration;
	
	
	@GetMapping("/limits")
	public LimitServiceConfiguration retrieve() {
		return new LimitServiceConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}

}
