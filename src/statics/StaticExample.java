package statics;

public class StaticExample {

	public static void main(String[] args) {
		Student student1 = new Student("John", 10);
		System.out.println(student1.name);
		System.out.println(student1.age);
		Student.addCount();
		System.out.println(Student.count);

		Student student2 = new Student("Karthick", 10);
		System.out.println(student2.name);
		System.out.println(student2.age);
		Student.addCount();
		System.out.println(Student.count);
	}

}
