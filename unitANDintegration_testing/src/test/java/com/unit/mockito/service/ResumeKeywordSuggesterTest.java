package com.unit.mockito.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

/**
 * @author Naveen K Wodeyaar,
 * @Date 12-Dec-2025
 */

public class ResumeKeywordSuggesterTest {

    @Test
    void testCoreJavaKeywords() {
        ResumeKeywordSuggester suggester = new ResumeKeywordSuggester();
        Set<String> result = suggester.suggestKeywords("core java expert");

        assertTrue(result.contains("OOP"));
        assertTrue(result.contains("Collections"));
        assertEquals(4, result.size());
    }

    @Test
    void testMultipleSkillCategories() {
        ResumeKeywordSuggester suggester = new ResumeKeywordSuggester();
        Set<String> result = suggester.suggestKeywords("spring, cloud");

        assertTrue(result.contains("Spring Boot"));
        assertTrue(result.contains("AWS"));
        assertTrue(result.contains("Kubernetes"));
        assertTrue(result.size() >= 5);
    }

    @Test
    void testNoMatchingKeywords() {
        ResumeKeywordSuggester suggester = new ResumeKeywordSuggester();
        Set<String> result = suggester.suggestKeywords("painting, cooking");

        assertTrue(result.isEmpty());
    }

    @Test
    void testNullInput() {
        ResumeKeywordSuggester suggester = new ResumeKeywordSuggester();
        Set<String> result = suggester.suggestKeywords(null);

        assertTrue(result.isEmpty());
    }

    @Test
    void testEmptyInput() {
        ResumeKeywordSuggester suggester = new ResumeKeywordSuggester();
        Set<String> result = suggester.suggestKeywords("   ");

        assertTrue(result.isEmpty());
    }

    @Test
    void testCaseInsensitiveMatching() {
        ResumeKeywordSuggester suggester = new ResumeKeywordSuggester();
        Set<String> result = suggester.suggestKeywords("SpRiNg DeVeLoPeR");

        assertTrue(result.contains("Spring Boot"));
        assertTrue(result.contains("Spring Security"));
    }
}

