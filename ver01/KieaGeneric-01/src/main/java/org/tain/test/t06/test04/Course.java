package org.tain.test.t06.test04;

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
	public Vector<?> getStudents() { return this.students; }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("[Course:%s,", this.name));
		sb.append(String.valueOf(this.students));
		sb.append("]");
		
		return sb.toString();
	}
}
