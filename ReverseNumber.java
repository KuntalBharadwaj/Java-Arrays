import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Finding number of digits
        int temp = num, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Storing digits in an array
        int[] digits = new int[count];
        temp = num;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Displaying the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
