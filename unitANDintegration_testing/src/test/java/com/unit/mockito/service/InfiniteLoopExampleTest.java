/**
 * @author Naveen K Wodeyaar,
 * @Date 27-Nov-2025
 */
package com.unit.mockito.service;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class InfiniteLoopExampleTest {

    @Test
    public void testLoopStartsAndStops() throws InterruptedException {

        InfiniteLoopExample example = new InfiniteLoopExample();

        Thread loopThread = new Thread(example::startLoop);
        loopThread.start();

        // Give the thread time to start
        Thread.sleep(50);

        // Check that loop is running
        assertTrue(example.isRunning());

        // Stop the loop
        example.stopLoop();

        // Wait for thread to finish
        loopThread.join(200);

        // Thread should be terminated
        assertFalse(loopThread.isAlive());
        assertFalse(example.isRunning());
    }

    public void testLoopDoesNotHangIndefinitely() throws InterruptedException {

        InfiniteLoopExample example = new InfiniteLoopExample();

        Thread loopThread = new Thread(example::startLoop);
        loopThread.start();

        Thread.sleep(50);
        example.stopLoop();

        loopThread.join();
    }
}
