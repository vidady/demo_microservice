package com.example.demo.controller;

import com.example.demo.model.CloudVendor;
import com.example.demo.response.ResponseHandler;
import com.example.demo.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return ResponseHandler.responseBuilder("Requested vendor details are given here", HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
    }

    @GetMapping()
    public ResponseEntity<Object> getAllCloudVendorDetails() {
        return ResponseHandler.responseBuilder("Getting all vendor details", HttpStatus.OK, cloudVendorService.getAllCloudVendors());
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.createCloudVendor(cloudVendor);
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.updateCloudVendor(cloudVendor);
    }


    @DeleteMapping("{vendorId}")
    public ResponseEntity<Object> deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return ResponseHandler.responseBuilder("Deleting vendor request",HttpStatus.OK,cloudVendorService.deleteCloudVendor(vendorId));
    }


}
