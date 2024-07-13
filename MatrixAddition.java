import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows and columns of the matrices: ");

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];

      
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

      
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

      
        int[][] sumMatrix = new int[row][col];

        // Calculate sum of matrices
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

       
        System.out.println("Sum of Matrices: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
