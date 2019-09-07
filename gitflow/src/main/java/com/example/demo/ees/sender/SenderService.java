package com.example.demo.ees.sender;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SenderService {
	private static Logger logger = LoggerFactory.getLogger(SenderService.class);
	@PostConstruct
	private void init() {
		logger.info(this.getClass().toString());
	}
}
