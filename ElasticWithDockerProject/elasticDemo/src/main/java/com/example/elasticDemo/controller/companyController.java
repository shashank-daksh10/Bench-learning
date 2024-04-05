//package com.example.elasticDemo.controller;
//
//import com.example.elasticDemo.Model.Company;
//import com.example.elasticDemo.service.CompanyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/company")
//public class companyController {
//
//    @Autowired
//    CompanyService companyService;
//
//    @PostMapping("/add")
//    public ResponseEntity<String>addCompany(@RequestBody Company company){
//        return companyService.saveData(company);
//    }
//    @GetMapping("/getAll")
//    public ResponseEntity<Iterable<Company>>getAll(){
//        return companyService.findAll();
//    }
//    @GetMapping("findByName/{name}")
//    public ResponseEntity<Company>findByName(@PathVariable String name){
//        return companyService.findByName(name);
//    }
//    @GetMapping("/salaryBetween")
//    public ResponseEntity<List<Company>>salaryBetween(@RequestParam int start, @RequestParam int end){
//        return companyService.findBySalaryBetween(start,end);
//    }
//    @GetMapping("/findByNativeQueryName/{name}")
//    public ResponseEntity<List<Company>>findByNativeQueryName(@PathVariable String name){
//        return companyService.findByNativeQueryName(name);
//    }
//}
