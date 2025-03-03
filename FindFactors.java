import java.util.Scanner;

class FindFactors {
	public static void main(String[] args) {
		// take input from user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int arr[] = new int[10];
		
		int j = 0;
		for(int i=1;i<=number;i++) {
			if(number%i == 0) { // checking is factor or not
				arr[j] = i;
				j++;
			}
		}
		
		// 
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) break;
			System.out.print(arr[i] + " ");
		}
		
	}
}