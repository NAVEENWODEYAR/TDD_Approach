package com.restsapi.rest_api_testing.repo;

import com.restsapi.rest_api_testing.entity.CloudVendor;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@RequiredArgsConstructor
public class CloudVendorRepositoryTest {

    @Autowired
    private CloudVendorRepository cloudVendorRepository;
     CloudVendor cloudVendor;

    @BeforeEach
    void setUp() {
        cloudVendor = new CloudVendor("1","Amazon","America","857532432");
        cloudVendorRepository.save(cloudVendor);
    }

    @AfterEach
    void tearDown() {
//        cloudVendor = null;
        cloudVendorRepository.deleteAll();
    }


    @Test
    public void findByVendorName_Found(){
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("Amazon");
        assertThat(cloudVendorList.get(0).getVendorId()).isEqualTo(cloudVendor.getVendorId());
        assertThat(cloudVendorList.get(0).getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
    }

    @Test
    public void findByVendorName_NotFound(){
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("GCP");
        assertThat(cloudVendorList.isEmpty()).isTrue();
//        assertThat(cloudVendorList.isEmpty()).isFalse();
    }

}
