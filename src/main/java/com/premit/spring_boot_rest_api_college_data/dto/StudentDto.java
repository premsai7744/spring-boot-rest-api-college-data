package com.premit.spring_boot_rest_api_college_data.dto;

import lombok.Data;

@Data
public class StudentDto {

    private String studentName;

    private String studentBranch;

    private String studentYearAndSemister;

    private AddressDto address;
}
