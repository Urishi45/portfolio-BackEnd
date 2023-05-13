package com.MyAPI.portfolioBackEnd.service;

import com.MyAPI.portfolioBackEnd.model.Education;
import com.MyAPI.portfolioBackEnd.repo.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    private final EducationRepo educationRepo;

    @Autowired
    public EducationService(EducationRepo educationRepo) {
        this.educationRepo = educationRepo;
    }

    public List<Education> getAllEducation() {
        return educationRepo.findAll();
    }

    public Education addEducation (Education education) {
        return educationRepo.save(education);
    }

    public Education updateEducation (Education education) {
        return educationRepo.save(education);
    }

    public void deleteEducation (Long id) {
        educationRepo.deleteById(id);
    }
}
