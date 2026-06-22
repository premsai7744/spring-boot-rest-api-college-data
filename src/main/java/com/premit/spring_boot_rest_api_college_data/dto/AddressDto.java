package com.premit.spring_boot_rest_api_college_data.dto;

import lombok.Data;

@Data
public class AddressDto {

    private String houseNo;

    private String city;

    private String district;

    private String state;

    private int pinCode;
}
