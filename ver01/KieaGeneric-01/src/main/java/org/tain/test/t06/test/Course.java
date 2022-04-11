package org.tain.test.t06.test;

import java.util.Vector;

public class Course<S> {

	private String name;
	private Vector<S> students;
	
	public Course(String name) {
		this.name = name;
		this.students = new Vector<>();
	}
	
	public void add(S student) {
		this.students.add(student);
	}
	
	public String getName() { return this.name; }
	public Vector<S> getStudents() { return this.students; }
	
	public String toString() {
		return String.format("[%s:%s]", this.name, String.valueOf(this.students));
	}
}
