package com.spring.springdatajpa2023.Repo;

import com.spring.springdatajpa2023.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

    // find all names matching exactly same with the firstName
    public List<Student> findByFirstName(String firstName);

    // find all names matching some character in firstName
    public List<Student> findByFirstNameContaining(String name);

    // find all names by their guardian firstName
    public List<Student> findByGuardianName(String name);


}
