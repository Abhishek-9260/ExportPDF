package com.example.stech;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.stech.model.Employee;
import com.example.stech.repository.EmployeeRepository;

	@SpringBootApplication
	public class PdfgeneratorApplication implements CommandLineRunner{
	     @Autowired  EmployeeRepository repository;
	    public static void main(String[] args) {
	        SpringApplication.run(PdfgeneratorApplication.class, args);
	    }
	     
	    @Override
	    public void run(String... args) throws Exception {
	 
	        if (repository.count() == 0) {
	            // save a list of Employees
	            repository.saveAll(Arrays.asList(
	                    new Employee("Abhishek", "Chandan", "Captain", "650.507.9833"),
	                    new Employee("Virat", "Kohli", "Vice-Captain", "650.507.9844"),
	                    new Employee("MahindraSingh", "Dhoni", "Wicket-keeper", "515.123.4444"),
	                    new Employee("Yuvraj", "Singh", "All Rounder", "515.123.5555"),
	                    new Employee("Rohit", "Sharma", "Opner", "603.123.6666"),
	                    new Employee("Bhuvnehswar", "Kumar", "Bowler", "550.907.9933"),
	                    new Employee("Manish", "Pandey", "Best Batsman", "515.123.7777")));
	        }
	 
	    }
	 
	}
	

