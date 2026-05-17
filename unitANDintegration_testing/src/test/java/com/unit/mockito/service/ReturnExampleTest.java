package com.unit.mockito.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Naveen K Wodeyaar,
 * @Date 26-Mar-2026
 */

class ReturnExampleTest {

    @Test
    void testMainMethodStopsAtThree() {
    	
        // Capture System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Call main method
            ReturnExample.main(new String[]{});

            // Expected output: only 1 and 2 (since return stops at 3)
            String expectedOutput = "1\n2\n";
            assertEquals(expectedOutput, outputStream.toString());

        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }
    
}
