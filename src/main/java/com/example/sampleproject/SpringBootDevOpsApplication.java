package com.example.sampleproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDevOpsApplication {
   public static Logger log = LoggerFactory.getLogger(SpringBootDevOpsApplication.class);
	public static void main(String[] args) {
		log.info("Application Executed");
		SpringApplication.run(SpringBootDevOpsApplication.class, args);
	}

}
