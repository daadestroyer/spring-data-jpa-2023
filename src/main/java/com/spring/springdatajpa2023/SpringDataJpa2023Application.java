package com.spring.springdatajpa2023;

import com.spring.springdatajpa2023.Repo.StudentRepo;
import com.spring.springdatajpa2023.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpa2023Application {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpa2023Application.class, args);
        StudentService studentService = context.getBean(StudentService.class);

        studentService.saveStudent();


        //studentService.printAllStudent();

        // System.out.println(studentService.findByFirstName("ram"));

//        System.out.println(studentService.findByFirstNameContaining("r"));

//        System.out.println(studentService.findByGuardianName("pankaj"));

//        System.out.println(studentService.findByFirstNameAndLastName("ram","singh"));

//        System.out.println("-------->"+studentService.getStudentByEmailAddress("ss1@gmail.com"));

//        System.out.println("firstName = "+studentService.getStudentFirstNameByEmailAddress("ss3@gmail.com"));


        System.out.println("Student --->"+studentService.getStudentByEmailAddressNative("ss1@gmail.com"));
    }


}
