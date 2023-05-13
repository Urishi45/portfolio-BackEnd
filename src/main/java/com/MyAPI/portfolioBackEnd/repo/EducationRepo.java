package com.MyAPI.portfolioBackEnd.repo;

import com.MyAPI.portfolioBackEnd.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepo extends JpaRepository<Education, Long> {
}
