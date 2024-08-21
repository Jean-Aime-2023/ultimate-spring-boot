package com.sizer.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    private final SchoolRepository schoolRepository;

    public SchoolController(SchoolRepository schoolRepository){
        this.schoolRepository  = schoolRepository;
    }

    @PostMapping("/school")
    public School createSchool(@RequestBody School school){
        return schoolRepository.save(school);
    }
    
    @GetMapping("/school")
    public List<School> getSchools(){
        return schoolRepository.findAll();
    }
    
}
