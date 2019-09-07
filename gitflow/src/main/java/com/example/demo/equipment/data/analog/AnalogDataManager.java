package com.example.demo.equipment.data.analog;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AnalogDataManager {
	private static Logger logger = LoggerFactory.getLogger(AnalogDataManager.class);
	@PostConstruct
	private void init() {
		logger.info(this.getClass().toString());
	}
}
