package methodoverloading;

public class MethodOverloadingExample {

	public int multipy(int x, int y) {
		return x * y;
	}

	public int multiply(int x, int y, int z) {
		return x * y * z;
	}

	public double multiply(double x, double y) {
		return x * y;
	}

	public static void main(String[] args) {
		MethodOverloadingExample methodOverLoad = new MethodOverloadingExample();
		System.out.println(methodOverLoad.multiply(10, 20));
		System.out.println(methodOverLoad.multiply(10, 20, 30));
		System.out.println(methodOverLoad.multiply(10.2, 20.2));
	}
}
