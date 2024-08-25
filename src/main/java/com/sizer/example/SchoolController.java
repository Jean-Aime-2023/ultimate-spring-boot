package com.sizer.example;

import java.util.List;
import java.util.stream.Collectors;

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

    private School toSchool(SchoolDto dto){
        return new School(dto.name());
    }

    @PostMapping("/school")
    public SchoolDto createSchool(@RequestBody SchoolDto dto){
        var school = toSchool(dto);
        schoolRepository.save(school); 
        return dto;
    }

    private SchoolDto toSchoolDto(School school){
        return new SchoolDto(school.getName());
    }

    @GetMapping("/school")
    public List<SchoolDto> getSchools(){
        return schoolRepository.findAll()
               .stream()
               .map(this::toSchoolDto)
               .collect(Collectors.toList());
    }
}
