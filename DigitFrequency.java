import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] frequency = new int[10];

        // Counting frequency of digits
        while (num > 0) {
            int digit = num % 10;
            frequency[digit]++;
            num /= 10;
        }

        // Displaying the frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

    }
}
