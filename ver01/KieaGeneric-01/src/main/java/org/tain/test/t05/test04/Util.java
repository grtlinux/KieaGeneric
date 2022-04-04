package org.tain.test.t05.test04;

public class Util {

	public static void printCourse(Course<?> course) {
		System.out.println(">>> " + course.getName() + "\t" + course.getStudent());
	}
	
	public static void printCourseWorker(Course<? super Worker> course) {
		System.out.println(">>> " + course.getName() + "\t" + course.getStudent());
	}
	
	public static void printCourseStudent(Course<? extends Student> course) {
		System.out.println(">>> " + course.getName() + "\t" + course.getStudent());
	}
}
