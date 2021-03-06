package com.rakhya.SpringbootFirst.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	//private String standard;

	@ManyToOne
	private Classroom classroom;
	
	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Student() {
		
	}
	
	public Student(int id, String name, int classroomId) {
		super();
		this.id = id;
		this.name = name;
		classroom = new Classroom(classroomId,"","");
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
