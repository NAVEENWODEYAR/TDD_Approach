package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar,
 * @Date 27-Nov-2025
 */

public class InfiniteLoopExample {

    private volatile boolean keepRunning = true;

    public void startLoop() {
        while (keepRunning) {
            // Simulated work
        }
    }

    public void stopLoop() {
        keepRunning = false;
    }

    public boolean isRunning() {
        return keepRunning;
    }
}
