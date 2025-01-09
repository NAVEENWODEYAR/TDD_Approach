package com.tdd.tdd_appraoch_demo.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import jakarta.annotation.*;

/**
 * @author Naveen K Wodeyar
 * @date 09-Jan-2025
 */
@Component
public class AppLog {
	
	private LocalDateTime startTime;
    private LocalDateTime shutdownTime;
    
    @PostConstruct
    public void onStart() {
        startTime = LocalDateTime.now();
        System.out.println("Application Started at: " + startTime);
    }

    @PreDestroy
    public void onShutdown() {
        shutdownTime = LocalDateTime.now();
        System.out.println("Application Shutdown at: " + shutdownTime);
    }

}
