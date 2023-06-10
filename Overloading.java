class maths {
	int multiply(int a, int b) {
		return a * b;
	}

	double multiply(double a, double b) {
		return a * b;
	}
}

public class Overloading {

	public static void main(String[] args) {

		maths m = new maths();
		System.out.println(m.multiply(4, 5));
		System.out.println(m.multiply(2.2, 3.4));
		System.out.println(m.multiply(4, 5.2));

	}

}
