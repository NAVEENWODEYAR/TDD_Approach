package com.tdd.tdd_appraoch_demo.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import jakarta.annotation.*;

/**
 * @author Naveen K Wodeyar
 * @date 09-Jan-2025
 */
@Component
public class AppLog {
	
	private static final Logger logger = LoggerFactory.getLogger(AppLog.class);

    private LocalDateTime startTime;
    private LocalDateTime shutdownTime;

    // You can inject Spring profiles or other configuration values
    @Value("${spring.profiles.active:default}")
    private String activeProfile;

    @PostConstruct
    public void onStart() {
        startTime = LocalDateTime.now();
        
        // Logging application start with thread info and environment
        logger.info("Application Started at: {} | Thread: {} | Environment: {}",
                formatDateTime(startTime), Thread.currentThread().getName(), activeProfile);

        // Additional debug level logging
        logger.debug("Debugging Application startup... Thread ID: {}",
                Thread.currentThread().getId());
        
        // Log the elapsed time for initialization (could be used for measuring startup performance)
        long startMillis = System.currentTimeMillis();
        logger.info("Initialization in progress...");

        // Simulate some work here (just for the example)
        try {
            Thread.sleep(500);  // Simulate work
        } catch (InterruptedException e) {
            logger.error("Initialization process was interrupted", e);
        }

        long elapsedMillis = System.currentTimeMillis() - startMillis;
        logger.info("Application initialization completed in {} ms.", elapsedMillis);
    }

    @PreDestroy
    public void onShutdown() {
        shutdownTime = LocalDateTime.now();
        
        // Log application shutdown with timestamp, thread info, and environment
        logger.info("Application Shutdown at: {} | Thread: {} | Environment: {}",
                formatDateTime(shutdownTime), Thread.currentThread().getName(), activeProfile);

        // Log with a warning level in case something might need attention before shutdown
        if (someImportantServiceNotReady()) {
            logger.warn("Important service is not ready for shutdown. Please check.");
        }

        // Log an error if the shutdown encounters an issue
        try {
            performShutdown();
        } catch (Exception e) {
            logger.error("Error during application shutdown", e);
        }
    }

    // Example of some helper methods
    private boolean someImportantServiceNotReady() {
        // Simulate checking service readiness
        return false;
    }

    private void performShutdown() throws Exception {
        // Simulate shutdown tasks
        logger.info("Performing shutdown tasks...");
        // Could throw an exception to simulate error
    }

    private String formatDateTime(LocalDateTime dateTime) {
        // Format the datetime for better readability in logs
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

}
