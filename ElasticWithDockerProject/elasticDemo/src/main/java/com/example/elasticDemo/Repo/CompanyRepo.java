//package com.example.elasticDemo.Repo;
//
//import com.example.elasticDemo.Model.Company;
//import org.springframework.data.elasticsearch.annotations.Query;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface CompanyRepo extends ElasticsearchRepository<Company,Integer>{
//
//    Optional<Company> findByName(String name);
//
//    List<Company> findByAvgSalaryBetween(int start, int end);
//
//    @Query(value = "{\"bool\":{\"must\":[{\"match\":{\"name\":\"?0\"}}]}}")
//    List<Company>findByQueryName(String name);
//}