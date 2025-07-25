package equalsandhascode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student karthick = new Student(3, "Karthick", "Chennai", 30);
		Student purushothaman = new Student(1, "akash", "Chennai", 20);
		Student santhosh = new Student(2, "Santhosh", "Chennai", 40);
		list.add(karthick);
		list.add(purushothaman);
		list.add(santhosh);

		System.out.println(list);
		list.forEach(student -> System.out.println(student.getName()));

		Collections.sort(list);

		System.out.println(list);
		list.forEach(student -> System.out.println(student.getName()));

		Collections.sort(list, new AgeComparator());
		System.out.println(list);
		list.forEach(student -> System.out.println(student.getName()));

		list.sort(Comparator.comparing(Student::getName).reversed());
		System.out.println(list);
		list.forEach(student -> System.out.println(student.getName()));

	}
}
