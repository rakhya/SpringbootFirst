package com.rakhya.SpringbootFirst.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakhya.SpringbootFirst.models.Classroom;
import com.rakhya.SpringbootFirst.services.ClassService;

@RestController
public class ClassController {
	
	@Autowired
	private ClassService classService;
	
	@Autowired
	private StudentController studentController;
	
	@RequestMapping(value="/webapi/classes/{id}", method=RequestMethod.GET)
	public Classroom getStudent(@PathVariable("id") int id) {
		return classService.getClassroom(id);
	}
	
	@RequestMapping(value="/webapi/addclass", method=RequestMethod.POST)
	public void addStudent(@RequestBody Classroom classroom) {
		classService.addClassroom(classroom);
	}
	
	@RequestMapping(value="/webapi/classes", method=RequestMethod.GET)
	public List<Classroom> getAllClassrooms(){
		return classService.getAllClassrooms();
	}
	
}
