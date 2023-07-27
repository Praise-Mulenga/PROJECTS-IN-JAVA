public class AdditionMatrix {

// This is a basic program that adds two matrices 

	public static void main (String[] argv) {

		// First matrix 
		int[][] matrix_A = new int [][] { {8,5,1}, {9,3,2}, {4,6,3} };

		// Second matrix
		int[][] matrix_B = new int[][] { {8,5,3},{9,5,7},{9,4,1} };
		
		// New matrix formed by adding the first and second matrix togther i.e  resultMatrix = Matrix A + Matrix B 
		int[][] resultMatrix = new int[3][3];
		
		for (int i = 0; i < resultMatrix.length; i++) {

			for (int j = 0; j < resultMatrix.length; j++) {

				// initiating the resultMatrix with the sums of matrix A and matrix B according to their positions, respectively.
				resultMatrix[i][j] = matrix_A[i][j] + matrix_B[i][j];
					
				// printing out all the numbers of array called resultMatrix formed from the two arrays - matrix A and matrix B, respectively.
				System.out.print (resultMatrix[i][j] + "\t");
			}

			// Creating spaces between rows of the array - resultMatrix above
			System.out.println();
			System.out.println();
		}
	}
}