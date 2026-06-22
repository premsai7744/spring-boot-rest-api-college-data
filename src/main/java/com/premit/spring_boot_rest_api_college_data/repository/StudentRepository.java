package com.premit.spring_boot_rest_api_college_data.repository;

import com.premit.spring_boot_rest_api_college_data.entity.AddressEntity;
import com.premit.spring_boot_rest_api_college_data.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, UUID> {
}
