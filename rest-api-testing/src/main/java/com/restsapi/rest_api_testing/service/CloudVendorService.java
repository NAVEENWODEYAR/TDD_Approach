package com.restsapi.rest_api_testing.service;

import com.restsapi.rest_api_testing.entity.CloudVendor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface CloudVendorService {

     String createCloudVendor(CloudVendor cloudVendor);
     String updateCloudVendor(CloudVendor cloudVendor);
     String deleteCloudVendor(String cloudVendorId);
     CloudVendor getCloudVendor(String cloudVendorId);
     List<CloudVendor> getAllCloudVendors();
     List<CloudVendor> getByVendorName(String vendorName);
     void evictAllUserCache();
}
