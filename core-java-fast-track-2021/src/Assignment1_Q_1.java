import java.util.Scanner;

public class Assignment1_Q_1 {
	
	public static void main(String args[]) {
		int n;
		int sum = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = in.nextInt();
		
		for(int i=1; i<=n; i++) {		
			sum = sum + i;
		}
		System.out.println("Sum of first 4 natural number is: " + sum);
		in.close();
	}
}
