package com.rakhya.SpringbootFirst.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rakhya.SpringbootFirst.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	public Student findById(int id);
	public List<Student> findByName(String name);
	public List<Student> findByStandard(String standard);
}
