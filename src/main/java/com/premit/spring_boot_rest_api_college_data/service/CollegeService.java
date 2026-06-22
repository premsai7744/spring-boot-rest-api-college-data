package com.premit.spring_boot_rest_api_college_data.service;

import com.premit.spring_boot_rest_api_college_data.dto.CollegeDto;
import org.springframework.stereotype.Service;

public interface CollegeService {
    public abstract String collegeRegistration(CollegeDto collegDto);
}
