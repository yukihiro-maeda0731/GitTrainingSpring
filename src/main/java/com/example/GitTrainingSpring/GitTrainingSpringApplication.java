package com.example.GitTrainingSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitTrainingSpringApplication.class, args);
		System.out.print("これはバージョン2ですmaster");
		int a = 0;
		System.out.print("これはバージョン2の1です");
		System.out.print("これはバージョン2の2です");
		System.out.print("master2です");
		System.out.print("master3です");
	}

}
