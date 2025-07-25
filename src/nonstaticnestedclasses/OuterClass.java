package nonstaticnestedclasses;

public class OuterClass {

	class InnerClass {
		void display() {
			System.out.println("in the inner class");
		}
	}

	// Method local inner class
	void outerClassMethod() {
		System.out.println("in the outer class method");

		class MethodLocalClass {
			void localInnerMethod() {
				System.out.println("in the method local class");
			}
		}

		MethodLocalClass mlc = new MethodLocalClass();
		mlc.localInnerMethod();
	}

}
