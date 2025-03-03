import java.util.Scanner;

public class MultiplicationSixToNine {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// taking input from user
		int number = sc.nextInt();
		
		// displaying the results
		for(int i=6;i<=9;i++) {
			System.out.println(number + " X " + i + " = " + number*i);
		}
		
	}
}