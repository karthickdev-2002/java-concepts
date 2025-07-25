package equalsandhascode;

public class EqualsAndHashcodeDemo {

	public static void main(String[] args) {
		Student std1 = new Student(1, "Karthick", "Chennai");
		Student std2 = new Student(1, "Karthick", "Mumbai");
		
		System.out.println(std1.equals(std2));
	}
}
