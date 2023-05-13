package com.MyAPI.portfolioBackEnd.repo;

import com.MyAPI.portfolioBackEnd.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepo extends JpaRepository<Experience, Long> {
}
