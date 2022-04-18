package org.tain.test.t08.test;

public class TestMain {

	public static void main(String[] args) {
		Person p1 = new Person("p1");
		Worker w1 = new Worker("w1");
		Student s1 = new Student("s1");
		HighStudent h1 = new HighStudent("h1");
		
		Course<Person> coursePerson = new Course<>("p-c");
		coursePerson.add(p1);
		coursePerson.add(w1);
		coursePerson.add(s1);
		coursePerson.add(h1);
		printCourse(coursePerson);
		
		Course<Student> courseStudent = new Course<>("s-c");
		//courseStudent.add(p1);
		//courseStudent.add(w1);
		courseStudent.add(s1);
		courseStudent.add(h1);
		printCourse(courseStudent);
		
		Course<Worker> courseWorker = new Course<>("w-c");
		//courseWorker.add(p1);
		courseWorker.add(w1);
		printCourse(courseWorker);
	}
	
	public static void printCourse(Course<? extends Person> course) {
		System.out.println(">>> " + course);
	}
}
