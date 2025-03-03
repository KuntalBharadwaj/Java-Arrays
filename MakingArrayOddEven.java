import java.util.Scanner;

public class MakingArrayOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number \n");
		
		// taking input from user
		int number = sc.nextInt();
		if(number <= 0) System.exit(0);
		
		int oddSize = number/2;
		int evenSize = number/2;
		
		if(number%2 != 0) oddSize++;
		
		int oddArray[] = new int[oddSize];
		int EvenArray[] = new int[evenSize];
		
		int k = 0;
		int l = 0;
		int j = 1;
		
		while(number >= j) {
			if(j%2 == 0) {
				EvenArray[k] = j;
				k++;
			}
			else {
				oddArray[l] = j;
				l++;
			}
			j++;
		} 
		
		
		// displaying the results
		for(int i=0;i<oddArray.length;i++) {
			System.out.print(oddArray[i] + " ");
		}
		
		System.out.print('\n');
		
		for(int i=0;i<EvenArray.length;i++) {
			System.out.print(EvenArray[i] + " ");
		}
		
	}
}