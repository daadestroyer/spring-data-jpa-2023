package com.spring.springdatajpa2023.Service;

import com.spring.springdatajpa2023.Entity.Course;
import com.spring.springdatajpa2023.Entity.Teacher;
import com.spring.springdatajpa2023.Repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;
    public String saveTeacher(){
        Course course = Course.
                builder().
                courseTitle("DBA").
                credit(5).
                build();
Course course2 = Course.
                builder().
                courseTitle("DSA").
                credit(5).
                build();
Course course3 = Course.
                builder().
                courseTitle("Java").
                credit(1).
                build();

        Teacher teacherData = Teacher.
                builder().
                firstName("shubham").
                lastName("nigam").
//                courseList(List.of(course,course2)).
                build();
        Teacher teacherData1 = Teacher.
                builder().
                firstName("ram").
                lastName("patel").
//                courseList(List.of(course,course2)).
                build();

                teacherRepo.save(teacherData1);
        return teacherRepo.save(teacherData) != null ? "Data Saved" : "Data not saved" ;
    }
}
