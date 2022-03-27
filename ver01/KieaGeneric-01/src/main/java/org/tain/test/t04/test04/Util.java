package org.tain.test.t04.test04;

public class Util {

	public static void printCourse(Course<?> course) {
		System.out.println(">>> " + course.getName() + "\t" + course.getStudents());
	}
	
	public static void printCourseStudent(Course<? extends Student> course) {
		System.out.println(">>> " + course.getName() + "\t" + course.getStudents());
	}
	
	public static void printCourseWorker(Course<? super Worker> course) {
		System.out.println(">>> " + course.getName() + "\t" + course.getStudents());
	}
}
