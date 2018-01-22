package com.rakhya.SpringbootFirst.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rakhya.SpringbootFirst.models.Student;
import com.rakhya.SpringbootFirst.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student getStudent(int id) {
		return studentRepository.findOne(id);
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void removeStudent(int id) {
		studentRepository.delete(id);
	}
	
	public void updateStudent(int id, Student student) {
		if(!(studentRepository.findById(id)==null)) {
			studentRepository.save(student);
		}
	}
	
	public List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	
	public List<Student> getStudentsByName(String name){
		return studentRepository.findByName(name); 
	}
}
			