package com.unit.mockito.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen K Wodeyaar,
 * @Date 10-Nov-2025
 */

public class KubectlCommandLister {

    /**
     * Runs `kubectl --help` and returns the entire output as a String.
     */
    public String getKubectlHelpOutput() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("kubectl", "--help");
        processBuilder.redirectErrorStream(true); // merge stdout + stderr

        Process process = processBuilder.start();

        StringBuilder output = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append(System.lineSeparator());
            }
        }

        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new RuntimeException("kubectl command failed with exit code " + exitCode);
        }

        return output.toString();
    }

    /**
     * Parses the output of `kubectl --help` and extracts the command names.
     */
    public List<String> parseCommands(String kubectlHelpOutput) {
        List<String> commands = new ArrayList<>();

        // Simple pattern: lines starting with two spaces and then a word
        for (String line : kubectlHelpOutput.split("\\r?\\n")) {
            line = line.trim();
            if (line.matches("^[a-z]+(\\s+.*)?$") && !line.contains(" ")) {
                // Basic sanity check to catch only single-word commands like "get", "create", etc.
                commands.add(line);
            }
        }

        return commands;
    }

    /**
     * High-level method to get all kubectl commands.
     */
    public List<String> listKubectlCommands() throws IOException, InterruptedException {
        String helpOutput = getKubectlHelpOutput();
        return parseCommands(helpOutput);
    }

    public static void main(String[] args) {
        KubectlCommandLister lister = new KubectlCommandLister();
        try {
            List<String> commands = lister.listKubectlCommands();
            System.out.println("=== kubectl Commands ===");
            commands.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
