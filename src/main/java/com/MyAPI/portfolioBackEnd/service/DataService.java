package com.MyAPI.portfolioBackEnd.service;

import com.MyAPI.portfolioBackEnd.model.Data;
import com.MyAPI.portfolioBackEnd.repo.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    private final DataRepo dataRepo;

    @Autowired
    public DataService(DataRepo dataRepo) {
        this.dataRepo = dataRepo;
    }

    public List<Data> getAllData() {
        return dataRepo.findAll();
    }

    public Data addData (Data data) {
        return dataRepo.save(data);
    }

    public Data updateData (Data data) {
        return dataRepo.save(data);
    }

    public void deleteData (Long id) {
        dataRepo.deleteById(id);
    }
}
