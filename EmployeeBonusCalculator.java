import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEE_COUNT = 10;

        // Arrays to store employee data
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];

        // Variables for total calculations
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Taking input for employees' salary and years of service
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            while (true) {
                try {
                    System.out.print("Enter salary of employee " + (i + 1) + ": ");
                    double salary = Double.parseDouble(scanner.nextLine());

                    System.out.print("Enter years of service of employee " + (i + 1) + ": ");
                    double years = Double.parseDouble(scanner.nextLine());

                    if (salary <= 0 || years < 0) {
                        System.out.println("Invalid input! Salary must be greater than 0 and years cannot be negative.");
                        continue;
                    }

                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter numeric values.");
                }
            }
        }

        // Calculate bonus, new salary, and total values
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            // Update totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print employee-wise details
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salaries[i] +
                    " | Years of Service: " + yearsOfService[i] +
                    " | Bonus: " + bonuses[i] +
                    " | New Salary: " + newSalaries[i]);
        }

        // Print total company expenditure
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

    }
}
