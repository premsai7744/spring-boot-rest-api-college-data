package com.premit.spring_boot_rest_api_college_data.service;

import com.premit.spring_boot_rest_api_college_data.dto.CollegeDto;
import com.premit.spring_boot_rest_api_college_data.entity.AddressEntity;
import com.premit.spring_boot_rest_api_college_data.entity.CollegeEntity;
import com.premit.spring_boot_rest_api_college_data.entity.StudentEntity;
import com.premit.spring_boot_rest_api_college_data.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CollegeServiceImplClass implements CollegeService{

    @Autowired
    CollegeRepository collegeRepository;

    @Override
    public String collegeRegistration(CollegeDto collegDto) {

        List<StudentEntity> studentEntityList = new ArrayList<>();

        collegDto.getStudentDtoList().forEach(dto->{
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setStudentBranch(dto.getStudentBranch());
            studentEntity.setStudentName(dto.getStudentName());

            AddressEntity addressEntity = new AddressEntity();
            addressEntity.setCity(dto.getAddress().getCity());
            addressEntity.setDistrict(dto.getAddress().getDistrict());
            addressEntity.setState(dto.getAddress().getState());
            addressEntity.setPinCode(dto.getAddress().getPinCode());
            addressEntity.setHouseNo(dto.getAddress().getHouseNo());

            studentEntity.setAddress(addressEntity);
            studentEntity.setStudentYearAndSemister(dto.getStudentYearAndSemister());

            studentEntityList.add(studentEntity);
        });

        CollegeEntity collegeEntity = new CollegeEntity();
        collegeEntity.setCollegeCode(collegDto.getCollegeCode());
        collegeEntity.setCollegeName(collegDto.getCollegeName());
        collegeEntity.setStudentEntityList(studentEntityList);


        if(collegeRepository.findByCollegeName(collegeEntity.getCollegeName()).isPresent()){
            return "Already "+collegeEntity.getCollegeName()+" college registered.";
        } else {

            CollegeEntity savedEntity = collegeRepository.save(collegeEntity);
            if (savedEntity != null) {
                return savedEntity.getCollegeName() + " college registerd succesfully.";
            } else {
                return "college registration failed.";
            }
        }
    }
}
