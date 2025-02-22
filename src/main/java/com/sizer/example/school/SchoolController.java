package com.sizer.example.school;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }
    

    @PostMapping("/school")
    public SchoolDto createSchool(@RequestBody SchoolDto dto){
        return schoolService.createSchool(dto);
    }


    @GetMapping("/school")
    public List<SchoolDto> getSchools(){
        return schoolService.findAll();
    }
}
