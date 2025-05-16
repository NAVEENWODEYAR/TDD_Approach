package com.restsapi.rest_api_testing.service.impl;

import com.restsapi.rest_api_testing.entity.CloudVendor;
import com.restsapi.rest_api_testing.exception.CloudVendorNotFoundException;
import com.restsapi.rest_api_testing.repo.CloudVendorRepository;
import com.restsapi.rest_api_testing.service.CloudVendorService;

import jakarta.transaction.Transactional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    private CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    @Transactional
    public String createCloudVendor(CloudVendor cloudVendor) {
        // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "cloudVendor successfully created,";
    }

    @Override
    @Transactional
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "cloudVendor successfully updated,";
    }

    @Override
    @Transactional
    public String deleteCloudVendor(String cloudVendorId) {
        // More Business Logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    @Transactional
    @Cacheable(value = "cloudVendor", key = "#id")
    public CloudVendor getCloudVendor(String cloudVendorId) {
        // More Business Logic
        if (cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    @Transactional
    public List<CloudVendor> getAllCloudVendors() {
        // More Business Logic
        return cloudVendorRepository.findAll();
    }

    @Override
    @Transactional
    public List<CloudVendor> getByVendorName(String vendorName) {
        return cloudVendorRepository.findByVendorName(vendorName);
    }
    
    @CacheEvict(value = "cloudVendor", allEntries = true)
    public void evictAllUserCache() {
        System.out.println("Cleared entire cloudVendor cache");
    }

}
