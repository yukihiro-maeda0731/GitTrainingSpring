package com.example.GitTrainingSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitTrainingSpringApplication.class, args);
		System.out.print("これはバージョン2ですmaster");
	}

}
