package com.example.MONGOYT.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "student")
public class Student { // will add reference class later

    @Id
    private String id;
    private String name;
    private Integer age;
    private String address;
    private Integer rollNumber;
    private Department department;
}
