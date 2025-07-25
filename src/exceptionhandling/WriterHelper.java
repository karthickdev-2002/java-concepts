package exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class WriterHelper {

	public void writeList() {

		try {

			List<Integer> a = new ArrayList<Integer>();
			a.add(10);
//			a.add(20);
//			a.add(30);

			System.out.println("Entering try statement");

			a.get(2);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("index error " + e);
		} finally {
			System.out.println("In finally block");
		}
	}

}
