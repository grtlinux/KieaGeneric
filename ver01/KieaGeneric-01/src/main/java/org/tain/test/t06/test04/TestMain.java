package org.tain.test.t06.test04;

public class TestMain {

	public static void main(String[] args) {
		Person person1 = new Person("일반인1");
		Person worker1 = new Person("직장인1");
		Person student1 = new Person("학생1");
		Person highStudent1 = new Person("고등학생1");
		
		Worker worker2 = new Worker("직장인2");
		
		Student student3 = new Student("학생3");
		Student highStudent3 = new Student("고등학생3");
		
		HighStudent highStudent4 = new HighStudent("고등학생4");
		
		Course<Person> coursePerson = new Course<>("일반인과정");
		Course<Worker> courseWorker = new Course<>("직장인과정");
		Course<Student> courseStudent = new Course<>("학생과정");
		Course<HighStudent> courseHighStudent = new Course<>("고등학생과정");
		
		coursePerson.add(person1);
		coursePerson.add(worker1);
		coursePerson.add(student1);
		coursePerson.add(highStudent1);
		
		courseWorker.add(worker2);
		
		courseStudent.add(student3);
		courseStudent.add(highStudent3);
		
		courseHighStudent.add(highStudent4);
		
		Util.printCourse(coursePerson);
		Util.printCourse(courseWorker);
		Util.printCourse(courseStudent);
		Util.printCourse(courseHighStudent);
		
		Util.printCourseWorker(coursePerson);
		Util.printCourseWorker(courseWorker);
		//Util.printCourseWorker(courseStudent);
		//Util.printCourseWorker(courseHighStudent);
		
		//Util.printCourseStudent(coursePerson);
		//Util.printCourseStudent(courseWorker);
		Util.printCourseStudent(courseStudent);
		Util.printCourseStudent(courseHighStudent);
		
		//Util.printCourseHighStudent(coursePerson);
		//Util.printCourseHighStudent(courseWorker);
		//Util.printCourseHighStudent(courseStudent);
		Util.printCourseHighStudent(courseHighStudent);
	}
}
