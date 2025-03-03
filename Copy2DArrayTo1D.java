import java.util.Scanner;

public class Copy2DArrayTo1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] arr1 = new int[rows][columns];

        // Taking user input for the 2D elements
        System.out.println("Enter the elements of the 2D elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to copy elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = arr1[i][j];
				index++;
            }
        }

        // Displaying the 1D array
        System.out.println("Elements in the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
