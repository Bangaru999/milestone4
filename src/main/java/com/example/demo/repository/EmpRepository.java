package com.example.demo.repository;

import java.util.*;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmpRepository {
	public List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employee;
	}

	public String add(Employee emp) {
		employee.add(emp);
		return "Sucessfully added";
	}


	
	
	}

