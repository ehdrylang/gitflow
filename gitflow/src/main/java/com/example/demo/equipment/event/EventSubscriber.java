package com.example.demo.equipment.event;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.equipment.data.DigitalDataManager;

@Component
public class EventSubscriber {
	private static Logger logger = LoggerFactory.getLogger(DigitalDataManager.class);
	@PostConstruct
	private void init() {
		logger.info(this.getClass().toString());
	}
}
