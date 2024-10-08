package com.restsapi.rest_api_testing.controller;

import com.restsapi.rest_api_testing.entity.CloudVendor;
import com.restsapi.rest_api_testing.response.ResponseHandler;
import com.restsapi.rest_api_testing.service.CloudVendorService;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "CloudVendorController",description = "The Cloud Vendor Controller,,")
@RestController
@RequestMapping("/api/cloud")
public class CloudVendorController {

    private CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @Operation(summary = "Test endpoint,",description = "Test endpoint for testing the controller satus,")
    @ApiResponses({
            @ApiResponse(code = 200,message = "SUCCESS",response = CloudVendor.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = Error.class)
    })
    @GetMapping
    public ResponseEntity<?> test(){
        return ResponseEntity.status(HttpStatus.OK).body("Welcome to the cloud vendor");
    }

    // Read Specific Cloud Vendor Details from DB
    @Operation(summary = "Get Cloud Vendor Details", description = "Read Specific Cloud Vendor Details from DB,")
    @ApiResponses({
            @ApiResponse(code = 200,message = "SUCCESS",response = CloudVendor.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = Error.class)
    })
    @GetMapping("/{vendorId}")
    @Schema(description = "This is a Cloud Vendor Id. It shall be unique.")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") @ApiParam(value = "Vendor Id",readOnly = true) String vendorId) {
        return ResponseHandler.responseBuilder("Requested Vendor Details are given here",
                HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
    }

    // Read All Cloud Vendor Details from DB
    @Operation(summary = "Get All Cloud Vendor Details", description = "Lists Cloud Vendor Details from DB,")
    @ApiResponses({
            @ApiResponse(code = 200,message = "SUCCESS",response = CloudVendor.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = Error.class)
    })
    @GetMapping("/list")
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    @Operation(summary = "Create Cloud Vendor Details", description = "Add/Creates new Cloud Vendor Details from DB,")
    @ApiResponses({
            @ApiResponse(code = 200,message = "SUCCESS",response = CloudVendor.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = Error.class)
    })
    @PostMapping("/add")
    public String createCloudVendorDetails(@RequestBody @ApiParam(value = "CloudVendor details",readOnly = true) CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @Operation(summary = "Update Cloud Vendor Details", description = "Updates the Cloud Vendor Details from DB,")
    @PutMapping("/update")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @Operation(summary = "Delete Cloud Vendor Details", description = "Deletes Specific Cloud Vendor Details from DB,")
    @ApiResponses({
            @ApiResponse(code = 200,message = "SUCCESS",response = CloudVendor.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = Error.class)
    })
    @DeleteMapping("/delete/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}
