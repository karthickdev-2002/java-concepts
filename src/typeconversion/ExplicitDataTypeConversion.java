package typeconversion;

public class ExplicitDataTypeConversion {
	public static void main(String[] args) {
		double a = 50.50;
		System.out.println(a);

		float f = (float) a;
		System.out.println(f);

		long b = (long) a;
		System.out.println(b);

		int c = (int) b;
		System.out.println(c);
	}
}
