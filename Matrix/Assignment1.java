/**
   Name:Felix Albores
   Schedule : 3:00-5:30 M-W
   
   Create a two(s) sets of a (3x3) two dimensional array representing a matrix,
   compute the sum of the two(2) matrix and display as a result matrix
   
   Example:
   
   matrixA, matrixB content should be inputted(input values must be from 0-9 only)
   
   matrix A          matrix B
   
   1   2   3        1   2   3
   4   5   6        4   5   6
   7   8   9        7   8   9
   
   result matrix < output
    2   4   6
    8  10  12
   14  16  18
*/
import java.util.Scanner;

public class Assignment1 {

    static final int ROWS = 3;
    static final int COLUMNS = 3;
    static int[][] firstMatrix = new int[ROWS][COLUMNS];
    static int[][] secondMatrix = new int[ROWS][COLUMNS];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inputNumbers(firstMatrix, "Matrix A");
        inputNumbers(secondMatrix, "Matrix B");
        displayMatrix();
        displayAndCalculateMatrixAddition();
    }

    //Input/Stored/Check/Catch the Error
    public static void inputNumbers(int[][] arrayOfMatrix, String message) {
        System.out.println(message);
        int elementsValue;
        for (int numberOfRows = 0; numberOfRows < ROWS; numberOfRows++) {
            for (int numberOfColumns = 0; numberOfColumns < COLUMNS; numberOfColumns++) {
                try {
                    while (true) {
                        System.out.print("[" + (numberOfRows + 1) + "]" + "[" + (numberOfColumns + 1) + "] = ");
                        elementsValue = scanner.nextInt();
                        arrayOfMatrix[numberOfRows][numberOfColumns] = elementsValue;
                        if (elementsValue >= 0 && elementsValue <= 9)
                            break;
                        System.out.println("Can't be Input less than 0 or greater than 9");
                    }
                } catch (Exception error) {
                    System.out.println("Input Error");
                    System.exit(0);
                }
            }
        }
    }

    //Display Matrix A and Matrix B
    public static void displayMatrix() {
        System.out.println("\nMatrix A  " + "    Matrix B");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(firstMatrix[i][j] + "  ");
                if ((j + 1) == COLUMNS) {
                    System.out.print("     ");
                    for (int x = 0; x < COLUMNS; x++)
                        System.out.print(secondMatrix[i][x] + "  ");
                }
            }
            System.out.print("\n");
        }
    }

    //The best function are those  with no parameters
    public static void displayAndCalculateMatrixAddition() {
        int sumOfTwoMatrix = 0;
        System.out.println("\nResult Matrix  < Output");
        for (int numberOfRow = 0; numberOfRow < ROWS; numberOfRow++) {
            for (int numberOfColumn = 0; numberOfColumn < COLUMNS; numberOfColumn++) {
                sumOfTwoMatrix = firstMatrix[numberOfRow][numberOfColumn] + secondMatrix[numberOfRow][numberOfColumn];
                if(sumOfTwoMatrix>=10)
                    System.out.print(" "+sumOfTwoMatrix);
                else
                    System.out.print("  "+ sumOfTwoMatrix);
            }
            System.out.println();
        }
    }
}