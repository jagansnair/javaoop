import java.util.Scanner;
class matrixadd{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows and column of the martices: ");		

		int row = scanner.nextInt();		
		int col = scanner.nextInt();
		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		
		System.out.println("Enter the elements of the first matrix: ");
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				matrix1[i][j] = scanner.nextInt();
				}		
		}		
		System.out.println("Enter the elements of the second matrix: ");
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				matrix2[i][j] = scanner.nextInt();
				}		
		}	
	
		int[][] summatrix = new int[row][col];
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				summatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				}		
		}
		System.out.println("Sum of Matrices: ");
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				System.out.print(summatrix[i][j]+" ");
				}
				System.out.print("\n");		
		}

	}
}
