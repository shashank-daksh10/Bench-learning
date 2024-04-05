package com.example.elasticDemo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "employee")
public class Employee {
    @Id
    private String id;
    private String name;
    private Integer age;

    public Employee() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
