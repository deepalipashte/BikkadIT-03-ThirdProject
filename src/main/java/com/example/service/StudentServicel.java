package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentServicel {
	
	public int addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Integer id);
	

}
