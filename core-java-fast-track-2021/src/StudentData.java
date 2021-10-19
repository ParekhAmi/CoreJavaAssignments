import java.util.Scanner;

class StudentData {
	private int stuID;
	private String stuName;
	private int stuAge;

	StudentData() {
		System.out.println("Default constructor.....");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student name: ");
		stuName = in.nextLine();

		System.out.println("Enter student Age: ");
		stuAge = in.nextInt();

		System.out.println("Enter student ID: ");
		stuID = in.nextInt();
		in.close();
	}

	StudentData(int id, String name, int age) {
		System.out.println("Parameterized constructor.....");
		stuID = id;
		stuName = name;
		stuAge = age;
	}

	private String getStuName() {

		return stuName;
	}

	private int getStuAge() {

		return stuAge;
	}

	private int getStuID() {

		return stuID;
	}

	public static void main(String args[]) {
		// This object creation would call the default constructor
		StudentData myobj = new StudentData();
		System.out.println("Student Name is: " + myobj.getStuName());
		System.out.println("Student Age is: " + myobj.getStuAge());
		System.out.println("Student ID is: " + myobj.getStuID());

		/*
		 * This object creation would call the parameterized constructor
		 * StudentData(int, String, int)
		 */
		StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
		System.out.println("Student Name is: " + myobj2.getStuName());
		System.out.println("Student Age is: " + myobj2.getStuAge());
		System.out.println("Student ID is: " + myobj2.getStuID());
	}
}
