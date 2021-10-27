class Parentclass {
	// Overridden method
	void display() {
		System.out.println("This is parent class method");
	}
}

// Complete following class:

class Subclass extends Parentclass {

	@Override
	void display() {
		System.out.println("Child class method");
		super.display();
	}

	void printMsg() {

	}
}

public class Assignment5 {
	public static void main(String args[]) {

		Subclass sub = new Subclass();
		sub.display();
	}
}