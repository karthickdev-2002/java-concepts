package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();

		queue.add("C");
		queue.add("B");
		queue.add("A");

		System.out.println(queue);

		System.out.println(queue.peek());

		queue.remove();
		
		System.out.println(queue);
		
		queue.poll();
		
		System.out.println(queue);

	}
}
