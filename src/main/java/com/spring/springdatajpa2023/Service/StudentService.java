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
        Student student1 = Student.builder()
                .firstName("shubham")
                .lastName("nigam")
                .emailId("ss1@gmail.com")
                .guardian(guardian).build();


        studentRepo.save(student1);

        Student student2 = Student.builder()
                .firstName("shubham")
                .lastName("kumar")
                .emailId("ss2@gmail.com")
                .guardian(guardian).build();


        studentRepo.save(student2);

        Student student3 = Student.builder()
                .firstName("ram")
                .lastName("singh")
                .emailId("ss3@gmail.com")
                .guardian(guardian).build();


        studentRepo.save(student3);


    }

    public void printAllStudent() {
        List<Student> studentList = studentRepo.findAll();
        System.out.println(studentList);
    }

    public List<Student> findByFirstName(String firstName) {
        return studentRepo.findByFirstName(firstName);
    }


    public List<Student> findByFirstNameContaining(String firstName) {
        return studentRepo.findByFirstNameContaining(firstName);
    }

    public List<Student> findByGuardianName(String name) {
        return studentRepo.findByGuardianName(name);
    }

    public Student findByFirstNameAndLastName(String firstName, String lastName) {
        Student student = studentRepo.findByFirstNameAndLastName(firstName, lastName);
        return student;
    }

    public Student getStudentByEmailAddress(String emailId){
        return studentRepo.getStudentByEmailAddress(emailId);
    }

    public String getStudentFirstNameByEmailAddress(String emailId){
        return studentRepo.getStudentFirstNameByEmailAddress(emailId);
    }


}
