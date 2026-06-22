package com.premit.spring_boot_rest_api_college_data.controller;

import com.premit.spring_boot_rest_api_college_data.dto.CollegeDto;
import com.premit.spring_boot_rest_api_college_data.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

    @Autowired
    CollegeService collegeService;

    @PostMapping(path="/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String collegeRegistration(@RequestBody CollegeDto collegeDto){
        System.out.println("CollegeController.collegeRegistration()::Request received : "+collegeDto);
        String collegedRegistrationResult = collegeService.collegeRegistration(collegeDto);
        return collegedRegistrationResult;
    }
}
