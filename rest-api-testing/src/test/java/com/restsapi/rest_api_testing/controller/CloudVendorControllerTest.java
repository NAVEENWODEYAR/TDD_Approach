package com.restsapi.rest_api_testing.controller;

import com.restsapi.rest_api_testing.entity.CloudVendor;
import com.restsapi.rest_api_testing.service.CloudVendorService;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CloudVendorController.class)
class CloudVendorControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private CloudVendorService cloudVendorService;

    CloudVendor cloudVendorOne;
    CloudVendor cloudVendorTwo;
    List<CloudVendor> cloudVendorList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        cloudVendorOne = new CloudVendor("1", "Amazon", "India", "919191919");
        cloudVendorTwo = new CloudVendor("2", "GCP", "USA", "9108987979879");
        cloudVendorList.add(cloudVendorOne);
        cloudVendorList.add(cloudVendorTwo);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test1() {
    }

    @Test
    void getCloudVendorDetails() throws Exception {
        when(cloudVendorService.getCloudVendor("1")).thenReturn(cloudVendorOne);
        this.mockMvc.perform(get("/api/cloud/1"))
                .andDo(print()).andExpect(status().isOk());
    }

    @Test
    void getAllCloudVendorDetails() {
        when(cloudVendorService.getAllCloudVendors()).thenReturn(cloudVendorList);
        try {
            this.mockMvc.perform(get("/api/cloud/list"))
                    .andDo(print()).andExpect(status().isOk());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void createCloudVendorDetails() {
        when(cloudVendorService.createCloudVendor(cloudVendorOne))
                .thenReturn("Success");
        this.mockMvc.perform(post("/api/cloud/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content())
                .andDo(print())
                .andExpect(status().isOk());



    }

    @Test
    void updateCloudVendorDetails() {
    }

    @SneakyThrows
    @Test
    void deleteCloudVendorDetails() {
        when(cloudVendorService.deleteCloudVendor("1"))
                .thenReturn("Success");

        this.mockMvc.perform(delete("/api/cloud/delete/1"))
                .andDo(print()).andExpect(status().isOk());
    }
}