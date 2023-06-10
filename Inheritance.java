
class Employee {
	float sal = 40000;

}

public class Inheritance extends Employee {
	int bonus = 10000;

	public static void main(String[] args) {

		Inheritance e = new Inheritance();
		System.out.println("employee salary is" + e.sal);
		System.out.println("employee bonus is" + e.bonus);

	}

}
