import java.util.Scanner;

public class ElegibleForVote {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		// taking input from user and print the result
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 0) System.out.println("Invalid Input");
			if(arr[i] >= 18) System.out.println("The student with the age "+ arr[i] +" can vote.");
			else System.out.println("The student with the age "+ arr[i] +" cannot vote.");
		}
	}
}