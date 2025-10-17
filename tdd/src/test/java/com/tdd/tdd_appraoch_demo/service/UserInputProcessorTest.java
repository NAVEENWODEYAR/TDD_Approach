package com.tdd.tdd_appraoch_demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserInputProcessorTest {

    UserInputProcessor processor = new UserInputProcessor();

    @Test
    public void testGreetUser() {
        String result = processor.greetUser("Alice", 30);
        assertEquals("Hello, Alice! You are 30 years old.", result);
    }

    @Test
    public void testSquareNumber_Positive() {
        assertEquals(25, processor.squareNumber(5));
    }

    @Test
    public void testSquareNumber_Negative() {
        assertEquals(9, processor.squareNumber(-3));
    }

    @Test
    public void testSquareNumber_Zero() {
        assertEquals(0, processor.squareNumber(0));
    }
}
