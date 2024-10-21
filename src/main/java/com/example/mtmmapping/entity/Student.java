package com.example.mtmmapping.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    String email;
    @ManyToMany(cascade = CascadeType.ALL)
    @JsonBackReference
    List<Subject> subjects;
}
