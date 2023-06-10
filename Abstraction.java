abstract class Bike {
	abstract void run();
}

public class Abstraction extends Bike {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b = new Abstraction();
		b.run();
	}

}
