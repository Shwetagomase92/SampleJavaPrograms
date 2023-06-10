import java.util.Scanner;

class person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		name=sc.nextLine();
		this.name = name;
	}

}

public class Encapsulation {

	public static void main(String[] args) {

		person p = new person();
		p.setName("Shweta");
		System.out.println(p.getName());
	}

}
