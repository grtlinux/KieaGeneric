package org.tain.test.t06.test04;

public class Util {

	public static void printCourse(Course<?> course) {
		System.out.println(">>> " + course);
	}
	
	public static void printCourseWorker(Course<? super Worker> course) {
		System.out.println(">>> " + course);
	}
	
	public static void printCourseStudent(Course<? extends Student> course) {
		System.out.println(">>> " + course);
	}
	
	public static void printCourseHighStudent(Course<HighStudent> course) {
		System.out.println(">>> " + course);
	}
}
