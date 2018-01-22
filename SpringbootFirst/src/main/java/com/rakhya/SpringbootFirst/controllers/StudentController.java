package com.rakhya.SpringbootFirst.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakhya.SpringbootFirst.models.Student;
import com.rakhya.SpringbootFirst.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/webapi/students/{id}", method=RequestMethod.GET)
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudent(id);
	}
	
	@RequestMapping(value="/webapi/addstudent", method=RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(value="/webapi/students", method=RequestMethod.GET)
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value="/webapi/updatestudent/{id}", method=RequestMethod.PUT)
	public void updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
		studentService.updateStudent(id, student);
	}
	
	@RequestMapping(value="/webapi/deletestudent/{id}", method=RequestMethod.DELETE)
	public void removeStudent(@PathVariable("id") int id) {
		studentService.removeStudent(id);
	}
	
	@RequestMapping(value="webapi/students/filter/{name}", method=RequestMethod.GET)
	public List<Student> getStudentByName(@PathVariable("name") String name){
		return studentService.getStudentsByName(name);
	}
}
