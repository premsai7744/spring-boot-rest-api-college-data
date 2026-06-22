package com.premit.spring_boot_rest_api_college_data.dto;

import lombok.Data;

import java.util.List;


@Data
public class CollegeDto {

    private String collegeName;

    private String collegeCode;

    private List<StudentDto> studentDtoList;
}
