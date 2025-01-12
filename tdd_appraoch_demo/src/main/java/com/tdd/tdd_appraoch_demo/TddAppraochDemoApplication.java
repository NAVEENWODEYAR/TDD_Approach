package com.tdd.tdd_appraoch_demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class TddAppraochDemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(TddAppraochDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TddAppraochDemoApplication.class, args);
		System.out.println("Test\n Driven\n Development");
	}
	
	@Scheduled(cron = "0 0/5 * * * ?")
	public void cronMethod() {
		log.info("Using cronExpression for scheduled job: {}",System.currentTimeMillis());
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd EEEE yyyy HH:mm");
        String formattedDate = now.format(formatter);
        log.error("Cron Method executed",formattedDate);
	}

}
