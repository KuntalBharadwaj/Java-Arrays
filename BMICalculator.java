import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Taking input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();

            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 24.9)
                status[i] = "Normal weight";
            else if (bmi[i] < 29.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Displaying results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " | Height: " + heights[i] + "m | Weight: " + weights[i] + "kg | BMI: " + bmi[i] + " | Status: " + status[i]);
        }

    }
}
