package TestPackage;

public class e {

	public static void main(String args[]) {

//String str = "Hello World";

		add(20, 30);

	}

	static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		// return c;
		if (a < b) {
			System.out.println("a is less than b");
		}
	}
}