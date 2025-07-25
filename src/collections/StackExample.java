package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack);
	
		System.out.println(stack.peek());
		String poppedString = stack.pop();
		
		System.out.println(poppedString);
		System.out.println(stack);
		
	}
}
