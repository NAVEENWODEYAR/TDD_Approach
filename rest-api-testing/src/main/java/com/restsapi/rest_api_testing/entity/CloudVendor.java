package com.restsapi.rest_api_testing.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "CLOUD_VENDOR_INFO stores the cloud vendor details,")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLOUD_VENDOR_INFO")
public class CloudVendor {

    @Id
    @Schema(description = "This is a Cloud Vendor Id. It shall be unique.")
    @ApiModelProperty(notes = "Unique key for each vendor",name = "Vendor_Id",dataType = "String")
    private String vendorId;

    @ApiModelProperty(notes = "Vendor name for each vendor",name = "Vendor_Name",dataType = "String")
    private String vendorName;

    @ApiModelProperty(notes = "Vendor address for each vendor",name = "Vendor_Address",dataType = "String")
    private String vendorAddress;

    @ApiModelProperty(notes = "Phone number of vendor",name = "Vendor_Number",dataType = "String")
    private String vendorPhoneNumber;

}
