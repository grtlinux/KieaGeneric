package org.tain.test.t03.test04;

public class TestMain {

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		personCourse.add(new Person("일반인1"));
		personCourse.add(new Person("직장인1"));
		personCourse.add(new Person("학생1"));
		personCourse.add(new Person("고등학생1"));
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add(new Worker("직장인2"));
		
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		studentCourse.add(new Student("학생3"));
		studentCourse.add(new Student("고등학생3"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생4"));
		
		Util.printCourse(personCourse);
		Util.printCourse(workerCourse);
		Util.printCourse(studentCourse);
		Util.printCourse(highStudentCourse);
		System.out.println();
		
		//Util.printCourseStudent(personCourse);
		//Util.printCourseStudent(workerCourse);
		Util.printCourseStudent(studentCourse);
		Util.printCourseStudent(highStudentCourse);
		System.out.println();
		
		Util.printCourseWorker(personCourse);
		Util.printCourseWorker(workerCourse);
		//Util.printCourseWorker(studentCourse);
		//Util.printCourseWorker(highStudentCourse);
		System.out.println();
	}
}
