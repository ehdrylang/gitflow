package com.example.demo.equipment.data;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DigitalDataManager {
	private static Logger logger = LoggerFactory.getLogger(DigitalDataManager.class);
	@PostConstruct
	private void init() {
		logger.info(this.getClass().toString());
	}
}
