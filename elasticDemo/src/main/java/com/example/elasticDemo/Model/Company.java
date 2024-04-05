package com.example.elasticDemo.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Document(indexName = "company")
public class Company {



    @Id
    private Integer id;
    private String name;
    private String yearFounded;
    private Integer avgSalary;
    private String location;
}
