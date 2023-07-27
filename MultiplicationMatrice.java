import java.util.*;

public class MultiplicationMatrice {
	
	// This is a basic program that adds two matrices 
	
	public static void main (String[] argv) {  
		
		// Takes pairs of grouped rows 
		int[][] matrixA = { {7, 14, 15, 6}, {4, 8, 12, 3}, {14, 21, 6, 9}, {13, 7, 6, 4} };
		
		// Takes pairs of grouped columns 
		int[][] matrixB = { {5, 8, 13, 6}, {7, 16, 6, 3}, {14, 4, 8, 2}, {2, 9, 4, 4} };
		
		// Takes the product of matrixA and matrixB
		// Rows and columns of matrixA and matrixB respectively, determine number of rows and columns of matrixA * matrixB
		int[][] productMatrix = new int [matrixA.length][matrixB.length];
		
		 for (int i = 0; i < productMatrix.length; i++) {
			
			for (int j = 0; j < productMatrix[0].length; j++) {
					
				productMatrix[i][j] = 0;
					
				for (int k = 0; k < matrixA[0].length; k++) {
						
					productMatrix[i][j] += matrixA[i][k] * matrixB[j][k];
					
				}
				
				System.out.print (productMatrix[i][j] + "\t");
				
			}
			System.out.println();
			System.out.println();
		 } 
					
	}
}