package com.example.demo;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;

@SpringBootApplication
public class Milestone4assesmentApplication implements CommandLineRunner {
	
	
	@Autowired
	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(Milestone4assesmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "ajay", 80000);
		Employee e2= new Employee(2, "vijay", 56000);
		Employee e3 = new Employee(3, "kanu", 340000);
		Employee e4= new Employee(4, "manu", 780000);
		Employee e5 = new Employee(5, "tanu", 56000);
		Employee e6 = new Employee(6, "vongeti", 500000);
		Employee e7 = new Employee(7, "dondeti", 78999);
		Employee e8 = new Employee(8, "aadi", 5368);
		Employee e9 = new Employee(9, "nani", 784365);
		Employee e10 = new Employee(10, "sampurnesh", 7657383);
		
		empRepository.employee.addAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
	}
	
	
}
