package com.premit.spring_boot_rest_api_college_data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name="addr")
public class AddressEntity {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name="addr_id")
    private UUID addressId;

    @Column(name="house_no")
    private String houseNo;

    @Column(name="city")
    private String city;

    @Column(name="district")
    private String district;

    @Column(name="state")
    private String state;

    @Column(name="pin_code")
    private int pinCode;
}
