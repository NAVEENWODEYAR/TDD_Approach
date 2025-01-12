package com.tdd.tdd_appraoch_demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.*;

@SpringBootApplication
@EnableScheduling
public class TddAppraochDemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(TddAppraochDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TddAppraochDemoApplication.class, args);
		System.out.println("Test\n Driven\n Development");
		log.warn("TddAppraochDemoApplication Started,,");
	}
	
	@Scheduled(cron = "0 0/10 * * * ?")
	public void cronMethod() {
		log.error("Method started using CronExp: {} ",LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
	}

}
