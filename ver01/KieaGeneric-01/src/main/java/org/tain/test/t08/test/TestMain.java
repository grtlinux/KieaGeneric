package org.tain.test.t08.test;

public class TestMain {

	public static void main(String[] args) throws Exception {
		if (Boolean.TRUE) test03();
		if (Boolean.TRUE) test04();
		if (Boolean.TRUE) test05();
	}
	
	private static void test03() throws Exception {
		Box<?> box = null;
		
		box = new Box<>(new Car("SM5"));
		System.out.println(">>> box: " + box);
		
		box = Util.boxing(new Tv("SmartTV"));
		System.out.println(">>> box: " + box);
		
		Pair<?,?> p1 = new Pair<>("Hello", new Car("SM5"));
		Pair<?,?> p2 = Util.pairing("Hello", new Car("SM5"));
		System.out.println(">>> equals: " + Util.equals(p1, p2));
		
		System.out.println(">>> compare: " + Util.compare((int) 1, (float) 1.0));
		System.out.println(">>> compare: " + Util.compare((int) 1, (float) 1.1));
		System.out.println(">>> compare: " + Util.compare((int) 1, (float) 0.9));
	}
	
	private static void test04() throws Exception {
		Person p1 = new Person("p1");
		Worker w1 = new Worker("w1");
		Student s1 = new Student("s1");
		HighStudent h1 = new HighStudent("h1");
		
		Worker w2 = new Worker("w2");
		
		Student s3 = new Student("s3");
		HighStudent h3 = new HighStudent("h3");
		
		Course<Person> coursePerson = new Course<>("P");
		Course<Worker> courseWorker = new Course<>("W");
		Course<Student> courseStudent = new Course<>("S");
		Course<HighStudent> courseHighStudent = new Course<>("H");
		
		coursePerson.add(p1);
		coursePerson.add(w1);
		coursePerson.add(s1);
		coursePerson.add(h1);
		courseWorker.add(w2);
		courseStudent.add(s3);
		courseStudent.add(h3);
		courseHighStudent.add(h3);
		
		Util.printCourse(coursePerson);
		Util.printCourse(courseWorker);
		Util.printCourse(courseStudent);
		Util.printCourse(courseHighStudent);
		
		courseWorker.add(w2);
		Util.printWorkerCourse(coursePerson);
		Util.printWorkerCourse(courseWorker);
		//Util.printWorkerCourse(courseStudent);
		//Util.printWorkerCourse(courseHighStudent);
		
		courseStudent.add(s3);
		courseStudent.add(h3);
		//Util.printStudentCourse(coursePerson);
		//Util.printStudentCourse(courseWorker);
		Util.printStudentCourse(courseStudent);
		Util.printStudentCourse(courseHighStudent);
		
		courseHighStudent.add(h3);
		//Util.printHighStudentCourse(coursePerson);
		//Util.printHighStudentCourse(courseWorker);
		//Util.printHighStudentCourse(courseStudent);
		Util.printHighStudentCourse(courseHighStudent);
	}
	
	private static void test05() throws Exception {
		ChildProduct<?,?,?> product = null;
		
		product = new ChildProduct<>(new Car("SM5"), "samsung", new Company("SAMSUNG"));
		System.out.println(">>> product: " + product);
		
		product = new ChildProduct<>(new Tv("SmartTV"), "LGD", new Company("LG"));
		System.out.println(">>> product: " + product);
		
		Storage<Car> carStorage = new StorageImpl<>("Car-Storage");
		carStorage.add(new Car("SM5"));
		carStorage.add(new Car("K5"));
		carStorage.add(new Car("QM5"));
		System.out.println(">>> carStorage: " + carStorage);
		
		Storage<Tv> tvStorage = new StorageImpl<>("Tv-Storage");
		tvStorage.add(new Tv("QLED"));
		tvStorage.add(new Tv("SmartTV"));
		tvStorage.add(new Tv("OLED"));
		System.out.println(">>> tvStorage: " + tvStorage);
		
		Storage<Company> companyStorage = new StorageImpl<>("Compnay-Storage");
		companyStorage.add(new Company("Samsung"));
		companyStorage.add(new Company("LG"));
		companyStorage.add(new Company("Hyundai"));
		System.out.println(">>> companyStorage: " + companyStorage);
	}
}
