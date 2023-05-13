package com.MyAPI.portfolioBackEnd;

import com.MyAPI.portfolioBackEnd.model.Education;
import com.MyAPI.portfolioBackEnd.service.EducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationResource {
    private final EducationService educationService;

    public EducationResource(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getAllEducation() {
        List<Education> education = educationService.getAllEducation();
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Education> addEducation (@RequestBody Education education) {
        Education newEducation = educationService.addEducation(education);
        return new ResponseEntity<>(newEducation, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Education> updateEducation (@RequestBody Education education) {
        Education updatedEducation = educationService.updateEducation(education);
        return new ResponseEntity<>(updatedEducation, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducation (@PathVariable ("id") Long id) {
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
