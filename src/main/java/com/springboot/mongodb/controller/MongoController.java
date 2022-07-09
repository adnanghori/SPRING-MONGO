package com.springboot.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongodb.model.Student;
import com.springboot.mongodb.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class MongoController {
		@Autowired
		private StudentRepository studentRepository;
	
		@PostMapping("/addStudent")
		public ResponseEntity<?> addStudent(@RequestBody Student student){
			Student savedStudent = this.studentRepository.save(student);
			return ResponseEntity.ok(savedStudent);
		}
		@GetMapping("/getStudents")
		
		public ResponseEntity<?> getStudents(){
			List<Student> allStudents = this.studentRepository.findAll();
			return ResponseEntity.ok(allStudents);
		}
}
