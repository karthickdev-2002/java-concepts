package nonstaticnestedclasses;

public class NestedClassDemo {

	public static void main(String[] args) {
		OuterClass.InnerClass object = new OuterClass().new InnerClass();
		object.display();

		OuterClass outerObject = new OuterClass();
		outerObject.outerClassMethod();
	}
}
