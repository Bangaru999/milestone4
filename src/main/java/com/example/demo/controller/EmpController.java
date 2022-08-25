package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Employee;

import service.EmpService;

@RestController

public class EmpController {
	
	@Autowired
	EmpService empService;
	
	
	@GetMapping("/get/all")
	public List<Employee>getAll(){
		return empService.getAll();
	}
	
	@GetMapping("/add")
	public String getAll(@RequestBody Employee emp){
		return empService.add(emp);
	}
	
	
}
