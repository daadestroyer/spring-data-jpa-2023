package com.spring.springdatajpa2023.Service;

import com.spring.springdatajpa2023.Entity.Course;
import com.spring.springdatajpa2023.Entity.CourseMaterial;

import com.spring.springdatajpa2023.Repo.CourseMaterialRepo;
import com.spring.springdatajpa2023.Repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseMaterialService {


    @Autowired
    private CourseMaterialRepo courseMaterialRepo;

    public void saveCourseMaterial(){
        Course course = Course.builder().courseTitle("dsa").credit(6).build();
        CourseMaterial courseMaterial = CourseMaterial.builder().url("https://www.google.com").course(course).build();
        courseMaterialRepo.save(courseMaterial);
    }

    public List<CourseMaterial> printAllCourseMaterial(){
        return courseMaterialRepo.findAll();
    }


}
