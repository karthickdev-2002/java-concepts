package staticnestedclasses;

public class OuterClass {

	static int staticIntMember = 10;
	int intMember = 20;
	private static int privateStaticIntMember = 30;

	static class StaticNestedClass {
		void display() {
			System.out.println(staticIntMember);
			System.out.println(privateStaticIntMember);
//			System.out.println(intMember); we can use an non-static variables and method inside an static block
		}
	}
}
