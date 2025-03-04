import java.util.Scanner;
import java.util.Arrays;

public class DynamicLargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            // If index reaches maxDigits, increase the array size by 10
            if (index == maxDigits) {
                maxDigits += 10;
                digits = Arrays.copyOf(digits, maxDigits);
            }

            digits[index++] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }

        // If the number was 0
        if (index == 0) {
            digits[index++] = 0;
        }

        // Initialize variables for largest and second largest
        int largest = -1, secondLargest = -1;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
    }
}
