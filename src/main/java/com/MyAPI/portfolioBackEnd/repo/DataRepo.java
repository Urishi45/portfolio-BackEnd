package com.MyAPI.portfolioBackEnd.repo;

import com.MyAPI.portfolioBackEnd.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<Data, Long> {
}
