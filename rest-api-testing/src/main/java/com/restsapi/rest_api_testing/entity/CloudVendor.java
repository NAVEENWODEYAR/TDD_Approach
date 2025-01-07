package com.restsapi.rest_api_testing.entity;

import java.util.Objects;

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
    
    
    public CloudVendor() {}


	/**
	 * @param vendorId
	 * @param vendorName
	 * @param vendorAddress
	 * @param vendorPhoneNumber
	 */
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}


	/**
	 * @return the vendorId
	 */
	public String getVendorId() {
		return vendorId;
	}


	/**
	 * @param vendorId the vendorId to set
	 */
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}


	/**
	 * @return the vendorName
	 */
	public String getVendorName() {
		return vendorName;
	}


	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	/**
	 * @return the vendorAddress
	 */
	public String getVendorAddress() {
		return vendorAddress;
	}


	/**
	 * @param vendorAddress the vendorAddress to set
	 */
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}


	/**
	 * @return the vendorPhoneNumber
	 */
	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}


	/**
	 * @param vendorPhoneNumber the vendorPhoneNumber to set
	 */
	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}


	@Override
	public int hashCode() {
		return Objects.hash(vendorAddress, vendorId, vendorName, vendorPhoneNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CloudVendor other = (CloudVendor) obj;
		return Objects.equals(vendorAddress, other.vendorAddress) && Objects.equals(vendorId, other.vendorId)
				&& Objects.equals(vendorName, other.vendorName)
				&& Objects.equals(vendorPhoneNumber, other.vendorPhoneNumber);
	}


	@Override
	public String toString() {
		return "CloudVendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ ", vendorPhoneNumber=" + vendorPhoneNumber + "]";
	}
    
    

}
