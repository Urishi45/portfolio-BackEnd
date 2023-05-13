package com.MyAPI.portfolioBackEnd;

import com.MyAPI.portfolioBackEnd.model.Experience;
import com.MyAPI.portfolioBackEnd.service.ExperienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceResource {
    private final ExperienceService experienceService;

    public ExperienceResource(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getAllExperience () {
        List<Experience> experience = experienceService.getAllExperience();
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experience> addExperience (@RequestBody Experience experience) {
        Experience newExperience = experienceService.addExperience(experience);
        return new ResponseEntity<>(newExperience, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience) {
        Experience updatedExperience = experienceService.updateExperience(experience);
        return new ResponseEntity<>(updatedExperience, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperience (@PathVariable ("id") Long id) {
        experienceService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
