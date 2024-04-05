package com.example.MONGOYT.controller;

import com.example.MONGOYT.models.Student;
import com.example.MONGOYT.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }


    @GetMapping("/findAll")
    public List<Student>allStudent(){
        return studentService.findAll();
    }


    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable String id){
        Student student=studentService.findById(id);
        return student;
    }


    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable String id,@RequestBody(required = false) Student student){
        return studentService.updateStudent(id,student);
    }


    @DeleteMapping("/deleteByid/{id}")
    public String DeleteById(@PathVariable String id){
        return studentService.deleteById(id);
    }


    @GetMapping("/pageable")
    public List<Student>getAllWithPagination(@RequestParam int pageNo,int pageSize){
        if(pageNo<1){
            throw new RuntimeException("PageCannot be smaller than one");
        }
        return studentService.getAllWithPagination(pageNo-1,pageSize);
    }



    // get student from embedded entity field that is departmentName
    // this is important
    @GetMapping("/getByDepartemntName")
    public List<Student>getStudentByDepartmentName(@RequestParam String departmentName){
        return studentService.findByDepartmentName(departmentName);
    }



    @GetMapping("/native") // example of native query for name starts with and age greater than
    //also we can use findeMethod like starWith and EndsWith too,but i have used native.
    public List<Student>nativeNameAndAge(@RequestParam String name,@RequestParam int age){
        return studentService.findByNameAndAgeNatve(name,age);
    }


}
