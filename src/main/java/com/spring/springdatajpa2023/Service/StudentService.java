package com.spring.springdatajpa2023.Service;

import com.spring.springdatajpa2023.Entity.Guardian;
import com.spring.springdatajpa2023.Entity.Student;
import com.spring.springdatajpa2023.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;


    public void saveStudent() {

        Guardian guardian = Guardian.builder().name("pankaj").email("ee@gmail.com").mobile("2222").build();
        Student student = Student.builder()
                .firstName("shubham")
                .lastName("nigam")
                .emailId("ss@gmail.com")
                .guardian(guardian).build();


        studentRepo.save(student);
    }

    public void printAllStudent() {
        List<Student> studentList = studentRepo.findAll();
        System.out.println(studentList);
    }

}
