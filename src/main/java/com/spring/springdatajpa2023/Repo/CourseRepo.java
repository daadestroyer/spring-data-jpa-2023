package com.spring.springdatajpa2023.Repo;

import com.spring.springdatajpa2023.Entity.Course;
import com.spring.springdatajpa2023.Entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
}
