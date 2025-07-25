package statics;

public class Student {

	static {
		System.out.println("Static block of code goes here");
	}

	String name;
	int age;
	static int count = 0;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	static void addCount() {
		count += 1;
	}
}
