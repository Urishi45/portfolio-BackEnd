package com.MyAPI.portfolioBackEnd;

import com.MyAPI.portfolioBackEnd.model.Data;
import com.MyAPI.portfolioBackEnd.service.DataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataResource {
    private final DataService dataService;

    public DataResource(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Data>> getAllData() {
        List<Data> data = dataService.getAllData();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Data> addData (@RequestBody Data data) {
        Data newData = dataService.addData(data);
        return new ResponseEntity<>(newData, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Data> updateData (@RequestBody Data data) {
        Data updatedData = dataService.updateData(data);
        return new ResponseEntity<>(updatedData, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteData (@PathVariable("id") Long id) {
        dataService.deleteData(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
