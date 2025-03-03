import java.util.Scanner;

public class FindSumOfPositiveNumber {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		
		// taking input from user
		while(true) {
			if(i == 10) break;
			int number = sc.nextInt();
			if(number <= 0) break;
			sum = sum + number;
			arr[i] = number;
			i++;
		}
		
		for(int j=0;j<10;j++) {
			System.out.println(arr[j]);
		}
		
		System.out.println(sum);
	}
}