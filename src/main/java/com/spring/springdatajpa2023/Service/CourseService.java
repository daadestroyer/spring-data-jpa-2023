package com.spring.springdatajpa2023.Service;

import com.spring.springdatajpa2023.Entity.Course;
import com.spring.springdatajpa2023.Entity.CourseMaterial;
import com.spring.springdatajpa2023.Entity.Teacher;
import com.spring.springdatajpa2023.Repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public List<Course> printAllCourse() {
        return courseRepo.findAll();
    }

    public String saveCourseWithTeacher() {
        Teacher teacher = Teacher.
                builder()
                .firstName("priyanka")
                .lastName("singh").build();

        Course course = Course.
                builder().
                courseTitle("c++").
                credit(6).
                teacher(teacher).
                build();

        Teacher teacher1 = Teacher.
                builder()
                .firstName("rekha")
                .lastName("singh").build();

        Course course1 = Course.
                builder().
                courseTitle("python").
                credit(6).
                teacher(teacher1).
                build();

        Teacher teacher3 = Teacher.
                builder()
                .firstName("suman")
                .lastName("singh").build();

        Course course3 = Course.
                builder().
                courseTitle("sql").
                credit(6).
                teacher(teacher3).
                build();

                courseRepo.save(course1);
                courseRepo.save(course3);
        return courseRepo.save(course) != null ? "Saved" : "Not Saved";
    }

    public List<Course> findAllPagination(){
        System.out.println("--------------------------------");
        Pageable firstPageWithThreeRecords = PageRequest.of(0,3);
        Pageable secondPageWithTwoRecords = PageRequest.of(0,2);
        Long totalElements = courseRepo.findAll(firstPageWithThreeRecords).getTotalElements();
        int totalPages = courseRepo.findAll(firstPageWithThreeRecords).getTotalPages();
        System.out.println("Total Elements = "+totalElements);
        System.out.println("Total Pages = "+totalPages);
        List<Course> courseList = courseRepo.findAll(firstPageWithThreeRecords).getContent();
        return courseList;
    }
}
