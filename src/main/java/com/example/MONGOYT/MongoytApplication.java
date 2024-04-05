package com.example.MONGOYT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories("com.example.MONGOYT.Repository") // not neccessary to use
public class MongoytApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoytApplication.class, args);
	}

}
