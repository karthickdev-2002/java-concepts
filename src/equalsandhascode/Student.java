package equalsandhascode;

public class Student implements Comparable<Student> {

	private int rollnumber;
	private String name;
	private String address;
	private int age;

	public Student() {
		super();
	}

	public Student(int rollnumber, String name, String address) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.address = address;
		this.age = 20;
	}
	
	public Student(int rollnumber, String name, String address, int age) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Student student = (Student) obj;

		return (student.rollnumber == this.rollnumber);
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public int compareTo(Student student) {
		return this.rollnumber - student.rollnumber;
	}
//	If the return value greater than 0 then the current value get higher precendence
//	if the return value lesser than 0 then the current value get lower precedence than current precedance
//	else the both will have same precedence

}
