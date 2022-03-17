package org.tain.test.t03.test04;

import java.util.Arrays;

public class Util {

	public static void printCourse(Course<?> course) {
		System.out.println(">>> " + course.getName() + "\t" + Arrays.toString(course.getStudents()));
	}
	
	public static void printCourseStudent(Course<? extends Student> course) {
		System.out.println(">>> " + course.getName() + "\t" + Arrays.toString(course.getStudents()));
	}
	
	public static void printCourseWorker(Course<? super Worker> course) {
		System.out.println(">>> " + course.getName() + "\t" + Arrays.toString(course.getStudents()));
	}
}
