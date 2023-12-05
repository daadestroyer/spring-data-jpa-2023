package com.spring.springdatajpa2023.Service;

import com.spring.springdatajpa2023.Entity.Course;
import com.spring.springdatajpa2023.Repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    public List<Course> printAllCourse(){
        return courseRepo.findAll();
    }
}
