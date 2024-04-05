package com.example.MONGOYT.service;

import com.example.MONGOYT.Repository.StudentRepository;
import com.example.MONGOYT.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String saveStudent(Student student){
        studentRepository.save(student);
        return "Student data saved to Mongo";
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(String id) {
        Student student=studentRepository.findById(id).orElse(new Student());
        return student;
    }

    public String updateStudent(String id,Student student) {
        Student student1=studentRepository.findById(id).orElse(null);
        if(Objects.isNull(student1)){
            return "Student Doesn't Exist for this id";
        }
        setStudent(student1,student);
        studentRepository.save(student1);
        return "Student Update Successfully";
    }
    private void setStudent(Student copyToStudent,Student copyFromStudent){
        if(Objects.nonNull(copyFromStudent.getName()))
        copyToStudent.setName(copyFromStudent.getName());
        if(Objects.nonNull(copyFromStudent.getAddress()))
        copyToStudent.setAddress(copyFromStudent.getAddress());
        if(Objects.nonNull(copyFromStudent.getAge()))
        copyToStudent.setAge(copyFromStudent.getAge());
        if(Objects.nonNull(copyFromStudent.getRollNumber()))
        copyToStudent.setRollNumber(copyFromStudent.getRollNumber());
        if(Objects.nonNull(copyFromStudent.getDepartment()))
        copyToStudent.setDepartment(copyFromStudent.getDepartment());
    }

    public String deleteById(String id) {
       boolean exist= studentRepository.existsById(id);
       if(Boolean.TRUE.equals(exist)) {
           studentRepository.deleteById(id);
           return "deleted Successfully";
       }
       return "Id not Found";
    }

    public List<Student> getAllWithPagination(int pageNo, int pageSize) {
        Sort sort=Sort.by(Sort.Direction.ASC,"name");// can make it dynamic also
        Pageable pageable= PageRequest.of(pageNo,pageSize,sort);
        List<Student>allPage=studentRepository.findAll(pageable).getContent();
        return allPage;
    }

    public List<Student> findByDepartmentName(String departmentName) {
        List<Student>studentList=studentRepository.findByDepartmentDepartmentName(departmentName);
        return studentList;
    }


    public List<Student> findByNameAndAgeNatve(String name, int age) {
        List<Student>studentList=studentRepository.findStudentsByNameAndAgeNativeQuery(name,age);
        return studentList;
    }
}
