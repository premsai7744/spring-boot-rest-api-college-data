package com.premit.spring_boot_rest_api_college_data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name="college")
@Data
public class CollegeEntity {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name="coll_id")
    private UUID collegeId;

    @Column(name="coll_name")
    private String collegeName;

    @Column(name="coll_code")
    private String collegeCode;

    @JoinColumn(name="coll_id")
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<StudentEntity> studentEntityList;
}
