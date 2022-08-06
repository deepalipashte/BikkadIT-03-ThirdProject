package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Student;
import com.example.repository.StudentRepository;

public class StudentServicelmpl implements StudentServicel {
	
	@Autowired
	private StudentRepository  studentRepository;

	@Override
	public int addStudent(Student student) {
Student save = studentRepository.save(student);
		
		return save.getStudentId();
		
}

	@Override
	public List<Student> getAllStudent() {
		 List<Student> findAll = studentRepository.findAll();
			return findAll;
		
	}

	@Override
	public Student getStudentById(Integer id) {
		
		Student findById = studentRepository.findById(id).get();
		return findById;
	}

}
