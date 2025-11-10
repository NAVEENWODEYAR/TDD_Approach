package com.unit.mockito.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.List;

/**
 * @author Naveen K Wodeyaar,
 * @Date 10-Nov-2025
 */

public class KubectlCommandListerTest {

    @Test
    void testParseCommands() {
        KubectlCommandLister lister = new KubectlCommandLister();
        String mockOutput = """
                kubectl controls the Kubernetes cluster manager.

                Basic Commands (Beginner):
                  create        Create a resource
                  get           Display resources
                  delete        Delete resources
                  explain       Documentation for a resource
                """;

        List<String> commands = lister.parseCommands(mockOutput);

        assertTrue(commands.contains("create"));
        assertTrue(commands.contains("get"));
        assertTrue(commands.contains("delete"));
        assertTrue(commands.contains("explain"));
        assertEquals(4, commands.size());
    }

    @Test
    void testListKubectlCommandsExecution() {
        KubectlCommandLister lister = new KubectlCommandLister();
        try {
            List<String> commands = lister.listKubectlCommands();
            assertNotNull(commands);
            assertTrue(commands.size() > 0, "Expected some kubectl commands to be listed");
        } catch (IOException | InterruptedException e) {
            // If kubectl is not installed, skip the test
            System.out.println("Skipping test: kubectl not available - " + e.getMessage());
        }
    }
}

