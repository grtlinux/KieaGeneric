package org.tain.test.t05.test04;

import java.util.Vector;

public class Course<T> {

	private String name;
	private Vector<T> student;
	
	public Course(String name) {
		this.name = name;
		this.student = new Vector<>();
	}
	
	public String getName() { return this.name; }
	public Vector<T> getStudent() { return this.student; }
	
	public void add(T student) {
		this.student.add(student);
	}
}
