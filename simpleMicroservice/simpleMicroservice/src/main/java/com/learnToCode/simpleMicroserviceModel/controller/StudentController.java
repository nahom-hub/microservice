package com.learnToCode.simpleMicroserviceModel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnToCode.simpleMicroserviceModel.Student;

@RestController

public class StudentController {
	@GetMapping("/lists")
	public Student studentDetails() {
		return new Student("Michael", "Nahom", 3, "male");
	}

}
