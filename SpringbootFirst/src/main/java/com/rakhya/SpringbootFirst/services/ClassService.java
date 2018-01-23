package com.rakhya.SpringbootFirst.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakhya.SpringbootFirst.models.Classroom;
import com.rakhya.SpringbootFirst.repository.ClassRepository;

@Service
public class ClassService {
	
	@Autowired
	private ClassRepository classRepository;
	
	public Classroom getClassroom(int id) {
		return classRepository.findOne(id);
	}
	
	public void addClassroom(Classroom classroom) {
		classRepository.save(classroom);
	}
	
	public List<Classroom> getAllClassrooms(){
		List<Classroom> classrooms = new ArrayList<>();
		classRepository.findAll().forEach(classrooms::add);
		return classrooms;
	}
}
