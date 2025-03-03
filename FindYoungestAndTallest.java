import java.util.Scanner;

class FindYoungestAndTallest {
	public static void main(String[] args) {
		int[] height = new int[3];
		int[] age = new int[3];
		
		// taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Ages in order Amar, Akbar, and Anthony");
		for(int i=0;i<3;i++){
			age[i] = sc.nextInt();
		}
		
		System.out.print("Enter the heights in order Amar, Akbar, and Anthony");
		for(int i=0;i<3;i++){
			height[i] = sc.nextInt();
		}
		
		// Finding the tallest and youngest and print
		if(age[0] < age[1] && age[0] < age[2]) System.out.println("The yougest Among Amar, Akbar, and Anthony is Amar");
		else if (age[1] < age[0] && age[1] < age[2]) System.out.println("The yougest Among Amar, Akbar, and Anthony is Akbar");
		else System.out.println("The yougest Among Amar, Akbar, and Anthony is Anthony");
		
		if(height[0] > height[1] && height[0] > height[2]) System.out.print("The tallest Among Amar, Akbar, and Anthony is Amar");
		else if (height[1] > height[0] && height[1] > height[2]) System.out.print("The tallest Among Amar, Akbar, and Anthony is Akbar");
		else System.out.print("The tallest Among Amar, Akbar, and Anthony is Anthony");
	}
}