package com.example.demo.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SignupController {
	private static Logger logger = LoggerFactory.getLogger(SignupController.class);
	@PostConstruct
	private void init() {
		logger.info(this.getClass().toString());
	}
}
