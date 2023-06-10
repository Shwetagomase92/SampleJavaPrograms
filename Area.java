import java.util.Scanner;

class AreaOfRectangleConstructor {
	int length, breadth;

	// constructor to initialize values
	AreaOfRectangleConstructor(int length, int breadth) {
		// Scanner class
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the breadth: ");
		breadth = Integer.parseInt(sc.nextLine());*/
		this.length = length;
		this.breadth = breadth;
	}

	// method to calculate area
	public void getarea() {
		int area = length * breadth;
		System.out.println("Area of rectangle: " + area);
	}
}

public class Area {

	public static void main(String[] args) {

		AreaOfRectangleConstructor rectangle = new AreaOfRectangleConstructor(6, 5);
		rectangle.getarea();
	}
}
