package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.repositery.StudentRepository;

@SpringBootApplication
public class StudentMangementCrudOperationApplication {

	public static void main(String[] args) {
		//SpringApplication springApplication = new SpringApplication("StudentMangementCrudOperation");
		//SpringApplication springApplication = new SpringApplication(null);
		//SpringApplication springApplication = new SpringApplication(null);
		SpringApplication.run(StudentMangementCrudOperationApplication.class, args);
		
	   }
	@SuppressWarnings("unused")
	@Autowired
	private StudentRepository studentRepository;
	
	public void run(String... args) throws Exception {
	
	

	}
}


