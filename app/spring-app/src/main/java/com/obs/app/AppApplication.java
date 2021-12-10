package com.obs.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;

@RestController
@SpringBootApplication
public class AppApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	final static Logger logger = Logger.getLogger(AppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		AppApplication obj = new AppApplication();
		obj.runMe("obs");
	}

	//logs a debug message
	private void runMe(String parameter){

		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}

		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
	}
}
