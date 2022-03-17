package org.tain.test.t03.test04;

public class Course<T> {

	public String name;
	public T[] students;
	
	@SuppressWarnings("unchecked")
	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[capacity];
	}
	
	public String getName() { return this.name; }
	public T[] getStudents() { return this.students; }
	
	public void add(T t) {
		for (int i=0; i < this.students.length; i++) {
			if (this.students[i] == null) {
				this.students[i] = t;
				break;
			}
		}
	}
}
