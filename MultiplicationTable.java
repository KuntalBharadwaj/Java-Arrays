import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// taking input from user
		int number = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(number + " X " + i + " = " + number*i);
		}
		
	}
}