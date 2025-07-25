package datatypes;

public class NonPrimitiveDataType {
	public static void main(String args[]) {
		String str = "test";
		System.out.println(str);

		String str1 = new String("test");
		System.out.println(str1);

		int arr[];
		arr = new int[2];
		arr[0] = 0;
		arr[1] = 1;

		System.out.println(arr);
		System.out.println(arr[0]);
	}
}
