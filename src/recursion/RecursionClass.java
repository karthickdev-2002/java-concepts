package recursion;

public class RecursionClass {

	int calculateFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * (calculateFactorial(n - 1)));
		}
	}
}
