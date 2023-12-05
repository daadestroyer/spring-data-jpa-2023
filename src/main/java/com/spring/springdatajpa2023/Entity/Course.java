package com.spring.springdatajpa2023.Entity;

import com.spring.springdatajpa2023.Service.CourseMaterialService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {

    @Id
    @SequenceGenerator(
            name="course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "course_sequence")
    private Long courseId;
    private String courseTitle;
    private Integer credit;
    @OneToOne( mappedBy = "course")
    private CourseMaterial courseMaterial;



}
