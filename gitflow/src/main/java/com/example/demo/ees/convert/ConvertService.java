package com.example.demo.ees.convert;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ConvertService {
	private static Logger logger = LoggerFactory.getLogger(ConvertService.class);
	@PostConstruct
	private void init() {
		logger.info(this.getClass().toString());
	}
}
