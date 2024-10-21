package com.example.mtmmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mtmmapping.entity.Subject;
import com.example.mtmmapping.repository.SubjectRepository;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    SubjectRepository subjectRepository;

    @RequestMapping
    public List<Subject> getAllsubjects(){
        return subjectRepository.findAll();
    }
    @PostMapping
    public Subject saveSubject(@RequestBody Subject subject){
        return subjectRepository.save(subject);
    }
    
}
