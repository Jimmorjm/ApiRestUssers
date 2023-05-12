package com.example.RestApiRJM.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "/dockerDemo")
@CrossOrigin("*")
public class DockerDemoController {
	
private Logger logger = LoggerFactory.getLogger(DockerDemoController.class);
	
	
	@GetMapping (path = "/getData")
	public String getData() {
		logger.info("Get data Docker demo");
		return "Info Docker demo Test";
	}

}
