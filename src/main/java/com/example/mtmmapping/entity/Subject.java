package com.example.mtmmapping.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue
    Integer id;
    String subjectName;
    String subjectTeacher;
    @ManyToMany(mappedBy = "subjects", cascade = CascadeType.ALL)
    @JsonManagedReference
    List<Student> students;
}
