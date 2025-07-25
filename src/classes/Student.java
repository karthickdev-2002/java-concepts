package classes;

public class Student {

	public String name;
	public Integer age;
	public String address;
	
	public Student(String name, Integer age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		Student student1 = new Student("Karthick", 12, "Chennai");
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getAddress());
	}
}
