import java.util.Scanner;

public class Assignment1_Q_2 {
	
	public static void main(String args[]) {
		int n;
		int fact = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = in.nextInt();
		
		int i = n;
		while(i>=1) {
			fact = fact * i;
			i--;
		}
		
		System.out.println("Factorial of "+ n + " is: "+ fact);
		in.close();
	}
}
