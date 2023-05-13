package com.MyAPI.portfolioBackEnd.service;

import com.MyAPI.portfolioBackEnd.model.Experience;
import com.MyAPI.portfolioBackEnd.repo.ExperienceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {
    private final ExperienceRepo experienceRepo;

    @Autowired
    public ExperienceService(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }

    public List<Experience> getAllExperience() {
        return experienceRepo.findAll();
    }

    public Experience addExperience (Experience experience) {
        return experienceRepo.save(experience);
    }

    public Experience updateExperience (Experience experience) {
        return experienceRepo.save(experience);
    }

    public void deleteExperience (Long id) {
        experienceRepo.deleteById(id);
    }
}
