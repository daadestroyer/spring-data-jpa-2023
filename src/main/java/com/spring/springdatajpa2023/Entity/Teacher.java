package com.spring.springdatajpa2023.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Teacher {

    @Id
    @SequenceGenerator(
            name="teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_sequence"
    )
    private Long teacherId;
    private String firstName;
    private String lastName;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "teacherId", referencedColumnName = "teacherId")
//    private List<Course> courseList;
}
