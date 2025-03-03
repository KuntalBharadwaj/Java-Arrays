import java.util.Scanner;

public class NumberCheck {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// taking input from user and print the result
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 0) System.out.println("Negative Number");
			else if(arr[i] == 0) System.out.println("Zero");
			else {
				if(arr[i]%2 == 0) System.out.println("Even Number");
				else System.out.println("Odd Number");
			}
		}
		
		if(arr[0] == arr[4]) System.out.println("Equal");
		else if(arr[0] > arr[4]) System.out.println("Greater");
		else System.out.println("Less");
	}
}