import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        double[][] personData = new double[n][3]; // Stores weight, height, BMI
        String[] weightStatus = new String[n];

        // Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight
            if (personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] < 24.9)
                weightStatus[i] = "Normal weight";
            else if (personData[i][2] < 29.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Display results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " | Weight: " + personData[i][0] + "kg | Height: " + personData[i][1] + "m | BMI: " + personData[i][2] + " | Status: " + weightStatus[i]);
        }
    }
}
