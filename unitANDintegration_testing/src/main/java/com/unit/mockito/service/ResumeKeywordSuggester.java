package com.unit.mockito.service;

import java.util.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 12-Dec-2025
 */

public class ResumeKeywordSuggester {

    private final Map<String, List<String>> keywordDatabase;

    public ResumeKeywordSuggester() {
        keywordDatabase = new HashMap<>();

        keywordDatabase.put("core java", Arrays.asList("OOP", "Collections", "Multithreading", "JVM Internals"));
        keywordDatabase.put("spring", Arrays.asList("Spring Boot", "Spring MVC", "Spring Security", "Spring Data JPA"));
        keywordDatabase.put("database", Arrays.asList("SQL", "MySQL", "PostgreSQL", "Hibernate", "JPA"));
        keywordDatabase.put("cloud", Arrays.asList("AWS", "Azure", "GCP", "Docker", "Kubernetes"));
        keywordDatabase.put("tools", Arrays.asList("Git", "Maven", "Gradle", "Jenkins", "CI/CD"));
        keywordDatabase.put("web", Arrays.asList("REST API", "Microservices", "JSON", "HTTP", "Servlets"));
    }

    public Set<String> suggestKeywords(String inputSkills) {
        if (inputSkills == null || inputSkills.trim().isEmpty()) {
            return Collections.emptySet();
        }

        String lowerInput = inputSkills.toLowerCase();
        Set<String> suggested = new LinkedHashSet<>();

        for (String key : keywordDatabase.keySet()) {
            if (lowerInput.contains(key)) {
                suggested.addAll(keywordDatabase.get(key));
            }
        }

        return suggested;
    }
}
