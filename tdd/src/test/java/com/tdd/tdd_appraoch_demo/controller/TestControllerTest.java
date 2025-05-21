package com.tdd.tdd_appraoch_demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TestController.class)
class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetMethodName_withValidParam_returnsEmptyString() throws Exception {
        mockMvc.perform(get("/test/test")
                .param("param", "value"))
                .andExpect(status().isOk())
                .andExpect(content().string("")); // since method returns new String()
    }
}

