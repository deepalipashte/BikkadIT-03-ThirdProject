package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentServicel;
@RestController
public class StudentController {
	
	@Autowired
	private StudentServicel studentServicel;
	
	@PostMapping(value="/addStudent",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Integer> addStudent(@RequestBody Student student) {
		int id = studentServicel.addStudent(student);
	
		return new ResponseEntity<Integer>(id,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/getAllStudent",produces = "application/json")
	public ResponseEntity<List<Student>> getAllStudent(){
	
		List<Student> allStudent = studentServicel.getAllStudent();
		
		return new ResponseEntity<List<Student>>(allStudent,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/getStudentById/{id}", produces = "application/json")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
		Student student = studentServicel.getStudentById(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}
	



}
