package com.restsapi.rest_api_testing.repo;

import com.restsapi.rest_api_testing.entity.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {

    List<CloudVendor> findByVendorName(String vendorName);

}
