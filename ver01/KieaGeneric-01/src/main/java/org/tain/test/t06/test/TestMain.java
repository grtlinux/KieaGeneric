package org.tain.test.t06.test;

public class TestMain {

	public static void main(String[] args) {
		if (!Boolean.TRUE) test03();
		if (!Boolean.TRUE) test04();
		if (Boolean.TRUE) test05();
	}
	
	private static void test03() {
		Box<?> box = null;
		
		box = new Box<>(new Car("SM5"));
		System.out.println(">>> box: " + box);
		
		box = new Box<>(new Tv("SmartTV"));
		System.out.println(">>> box: " + box);
		
		box = Util.boxing("Hello, world");
		System.out.println(">>> box: " + box);
		
		box = Util.boxing(new Tv("QLED"));
		System.out.println(">>> box: " + box);
		
		Pair<?,?> pair = null;
		
		pair = new Pair<>("car", new Car("K5"));
		System.out.println(">>> pair: " + pair);
		
		pair = new Pair<>(new Tv("SmartTV"), new Car("SM5"));
		System.out.println(">>> pair: " + pair);
		
		pair = Util.pairing("world", new Car("QM5"));
		System.out.println(">>> pair: " + pair);
		
		pair = Util.pairing("Hello", "world");
		System.out.println(">>> pair: " + pair);
		
		System.out.println(">>> equals of Box: " + Util.equals(new Box<>(new Car("K9")), Util.boxing(new Car("K9"))));
		System.out.println(">>> equals of Box: " + Util.equals(new Box<>(new Car("K9")), Util.boxing(new Tv("K9"))));
		
		System.out.println(">>> equals of Pair: " + Util.equals(new Pair<>("Hello", new Car("Sonata")), Util.pairing("Hello", new Car("Sonata"))));
		System.out.println(">>> equals of Pair: " + Util.equals(new Pair<>("Hello", new Car("Sonata")), Util.pairing(new Car("Sonata"), "Hello")));
		
		System.out.println(">>> compare : " + Util.compare(1, 1.0));
		System.out.println(">>> compare : " + Util.compare(new Double(1), 1.1));
		System.out.println(">>> compare : " + Util.compare(new Double(1.2), 1.1));
	}
	
	private static void test04() {
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
		ChildProduct<?,?,?> product = null;
		product = new ChildProduct<>(new Car("K5"), "KIA", "KIA moters");
		System.out.println(">>> product: " + product);
		
		product = new ChildProduct<>(new Tv("SmartTV"), "LGD", "LG");
		System.out.println(">>> product: " + product);
		
		Storage<Car> carStorage = new StorageImpl<>("CAR-Storage");
		carStorage.add(new Car("SM5"));
		carStorage.add(new Car("K5"));
		carStorage.add(new Car("G80"));
		carStorage.add(new Car("K9"));
		System.out.println(">>> carStorage: " + carStorage);
		
		Storage<Tv> tvStorage = new StorageImpl<>("TV-Storage");
		tvStorage.add(new Tv("SmartTV"));
		tvStorage.add(new Tv("QLED"));
		System.out.println(">>> tvStorage: " + tvStorage);
	}
}
