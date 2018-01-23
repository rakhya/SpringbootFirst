package com.rakhya.SpringbootFirst.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rakhya.SpringbootFirst.models.Classroom;
import com.rakhya.SpringbootFirst.models.Student;
import com.rakhya.SpringbootFirst.repository.ClassRepository;
import com.rakhya.SpringbootFirst.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ClassRepository classRepository;
	
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
		if(!(studentRepository.findOne(id)==null)) {
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
	
	public List<Student> getStudentsByClass(int classroomId){
		return studentRepository.findByClassroomId(classroomId);
	}

	public void addClasstoStudent(int classroomId, int studentId) {
		Classroom classroom = classRepository.findOne(classroomId);
		Student student = studentRepository.findOne(studentId);
		student.setClassroom(classroom);
		studentRepository.save(student);
	}
}
			