package com.spring.springdatajpa2023.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_student")
public class Student {

    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    private Long studentId;

    @Column(name = "fname")
    private String firstName;
    @Column(name="lname")
    private String lastName;
    @Column(name = "email")
    private String emailId;

    @Embedded
    private Guardian guardian;
}
