package org.tain.test.t02.test04;

public class Course<T> {

	private String name;
	private T[] students;
	
	@SuppressWarnings("unchecked")
	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[capacity];
	}
	
	public String getName() {
		return this.name;
	}
	
	public T[] getStudents() {
		return this.students;
	}
	
	public void add(T t) {
		for (int i=0; i < this.students.length; i++) {
			if (this.students[i] == null) {
				this.students[i] = t;
				break;
			}
		}
	}
}
