package com.premit.spring_boot_rest_api_college_data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name="student")
public class StudentEntity {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name="stu_name")
    private UUID studentId;

    @Column(name="stu_name")
    private String studentName;

    @Column(name="stu_branch")
    private String studentBranch;

    @Column(name="stu_year_semister")
    private String studentYearAndSemister;

    @JoinColumn(name="addr_id")
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private AddressEntity address;
}
