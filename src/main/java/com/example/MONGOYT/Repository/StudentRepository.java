package com.example.MONGOYT.Repository;

import com.example.MONGOYT.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student,String> {


    List<Student> findByDepartmentDepartmentName(String departmentName);


    @Query("{ 'name': { '$regex':'^?0', '$options': 'i' }, 'age': { '$gte': ?1 } }")
    //here ?0 means parameter i.e first para=0 then second =1 and so on.
    // ^ is used to have value starts with
    List<Student> findStudentsByNameAndAgeNativeQuery(String name,int age);
}
