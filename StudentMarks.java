import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // Taking input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Physics: ");
            physics[i] = scanner.nextInt();
            System.out.print("Enter marks for Chemistry: ");
            chemistry[i] = scanner.nextInt();
            System.out.print("Enter marks for Maths: ");
            maths[i] = scanner.nextInt();

            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grades[i] = (percentages[i] >= 90) ? 'A' :
                        (percentages[i] >= 80) ? 'B' :
                        (percentages[i] >= 70) ? 'C' :
                        (percentages[i] >= 60) ? 'D' : 'F';
        }

        // Display results
        System.out.println("\nStudent Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " | Physics: " + physics[i] + " | Chemistry: " + chemistry[i] + " | Maths: " + maths[i] +
                    " | Percentage: " + percentages[i] + "% | Grade: " + grades[i]);
        }

    }
}
