package org.tain.test.t07.test;

public class TestMain {

	public static void main(String[] args) {
		if (Boolean.TRUE) test03();
		if (Boolean.TRUE) test04();
		if (Boolean.TRUE) test05();
	}
	
	private static void test03() {
		System.out.println("\n--- test03 ---");
		
		Box<?> box = null;
		
		box = new Box<>(new Car("SM5"));
		System.out.println(">>> box: " + box);
		
		box = new Box<>(new Tv("SmartTV"));
		System.out.println(">>> box: " + box);
		
		box = Util.boxing(new Car("K5"));
		System.out.println(">>> box: " + box);
		
		Pair<?,?> pair = null;
		
		pair = new Pair<>(new Box<>(new Tv("QLED")), Util.boxing("Hello"));
		System.out.println(">>> pair: " + pair);
		
		pair = Util.pairing(new Pair<>(new Car("QM5"), "Samsung"), Util.boxing(new Tv("SmartTV")));
		System.out.println(">>> pair: " + pair);
		
		System.out.println(">>> equals of Box: " + Util.equals(Util.boxing(new Car("K5")), new Box<>(new Car("K5"))));
		System.out.println(">>> equals of Pair: " + Util.equals(Util.pairing(new Car("K5"), new Tv("SmartTV")), new Pair<>(new Car("K5"), new Tv("SmartTV"))));
		
		System.out.println(">>> compare of Number: " + Util.compare(1.1, 1));
		System.out.println(">>> compare of Number: " + Util.compare(1, 1.0));
		System.out.println(">>> compare of Number: " + Util.compare(1, 1.1));
	}
	
	private static void test04() {
		System.out.println("\n--- test04 ---");
		
		Person person1 = new Person("일반인1");
		Worker worker1 = new Worker("직장인1");
		Student student1 = new Student("학생1");
		HighStudent highStudent1 = new HighStudent("고등학생1");
		
		Worker worker2 = new Worker("직장인2");
		
		Student student3 = new Student("학생3");
		HighStudent highStudent3 = new HighStudent("고등학생3");
		
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
	}
	
	private static void test05() {
		System.out.println("\n--- test05 ---");
		
		ChildProduct<?,?,?> product = null;
		
		product = new ChildProduct<>(new Car("SM5"), "SamsungMoters", new Company("Samsung"));
		System.out.println(">>> product: " + product);
		
		product = new ChildProduct<>(new Tv("SmartTV"), "LGD", new Company("LG"));
		System.out.println(">>> product: " + product);
		
		StorageImpl<Box<?>> storage = new StorageImpl<>("Box-Storage");
		storage.add(new Box<>(new Car("SM5")));
		storage.add(new Box<>(new Tv("QLED")));
		storage.add(new Box<>(new Tv("SmartTV")));
		System.out.println(">>> storage: " + storage);
	}
}
