package com.restsapi.rest_api_testing.controller;

import com.restsapi.rest_api_testing.entity.CloudVendor;
import com.restsapi.rest_api_testing.response.ResponseHandler;
import com.restsapi.rest_api_testing.service.CloudVendorService;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cloud")
public class CloudVendorController {

    private CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping
    public ResponseEntity<?> test(){
        return ResponseEntity.status(HttpStatus.OK).body("Welcome to the cloud vendor");
    }

    // Read Specific Cloud Vendor Details from DB
    @GetMapping("/{vendorId}")
    @Schema(description = "This is a Cloud Vendor Id. It shall be unique.")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return ResponseHandler.responseBuilder("Requested Vendor Details are given here",
                HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
    }

    // Read All Cloud Vendor Details from DB
    @GetMapping("/list")
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping("/add")
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping("/update")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("/delete/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}
