package com.rakhya.SpringbootFirst.repository;

import org.springframework.data.repository.CrudRepository;

import com.rakhya.SpringbootFirst.models.Classroom;

public interface ClassRepository extends CrudRepository<Classroom,Integer>{
	
}
