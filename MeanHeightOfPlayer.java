import java.util.Scanner;

public class MeanHeightOfPlayer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height of the Player \n");
		
		// taking input from user
		int sum = 0;
		for(int i=0;i<11;i++) {
			int number = sc.nextInt();
			sum = sum + number;
		}
		
		// displaying the results
		System.out.print("\n the Mean height of the players is " + sum/11);
		
	}
}