package com.example.elasticDemo.service;

import com.example.elasticDemo.Model.Company;
import com.example.elasticDemo.Repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    CompanyRepo companyRepo;
    public ResponseEntity<String> saveData(Company company) {
        companyRepo.save(company);
        return ResponseEntity.ok("Saved Successfully");
    }

    public ResponseEntity<Iterable<Company>> findAll() {
        Iterable<Company>companies= companyRepo.findAll();
        return ResponseEntity.ok(companies);
    }

    public ResponseEntity<Company> findByName(String name) {
        Optional<Company> companyOptional=companyRepo.findByName(name);
        if(companyOptional.isPresent()){
            return ResponseEntity.ok(companyOptional.get());
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Company>> findBySalaryBetween(int start, int end) {
        List<Company> companies=companyRepo.findByAvgSalaryBetween(start,end);
        return ResponseEntity.ok(companies);
    }

    public ResponseEntity<List<Company>> findByNativeQueryName(String name) {
        List<Company>companies=companyRepo.findByQueryName(name);
        return ResponseEntity.ok(companies);
    }
}
