package com.spring.springdatajpa2023.Repo;

import com.spring.springdatajpa2023.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

    // find students by first name and last name
    public Student findByFirstNameAndLastName(String firstName,String lastName);

    // get student by email address
    // JPQL Query
    @Query("select student from Student student where student.emailId = ?1")
    Student getStudentByEmailAddress(String emailId);

    // get student first name by email address
    @Query("select student.firstName from Student student where student.emailId = ?1 ")
    String getStudentFirstNameByEmailAddress(String emailId);

    // Native Query
    @Query(
            value = "SELECT * FROM tbl_student s where s.email = ?1",
            nativeQuery = true
    )
    Student getStudentByEmailAddressNative(String emailId);

    // Native Named Param
    @Query(
            value = "SELECT * FROM tbl_student s where s.email = :emailId",
            nativeQuery = true
    )
    Student getStudentByEmailAddressNativeNamedParam(@Param("emailId") String emailId);

}
