package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(20);
		numberList.add(10);
		numberList.add(30);
		numberList.add(30);

		// Representation value changing
		List<Integer> squareList = numberList.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(squareList);

		// Collecting result in set
		Set<Integer> squareSet = numberList.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(squareSet);

		// Filtering array
		List<Integer> filterResult = numberList.stream().filter(x -> x <= 20).collect(Collectors.toList());
		System.out.println(filterResult);

		// Sorting array
		List<Integer> sortedResult = numberList.stream().filter(x -> x <= 20).sorted().collect(Collectors.toList());
		System.out.println(sortedResult);

		// Foreach
		numberList.stream().forEach(x -> System.out.println(x / 5)); // Single line
		numberList.stream().forEach(x -> { // Multi line
			System.out.println(x / 5);
		});

		// Reduce
		// Identity -- will the default value and default result if the stream is empty
		// Accumulator -- have two params, partial result of reduction and the next
		// element of stream
		// Combiner -- optional function, if the accumulator is different data type,
		// then we need to use combiner
		int sum = numberList.stream().filter(x -> x > 20).reduce(0, (ans, i) -> ans + i);
		System.out.println(sum);

	}
}
