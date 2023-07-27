package myFirstProgram.java;

public class AlphabetGrid {
	
	public static void main (String[] argv) {  
		
		// Set to the first letter of the alphabet
		char letter = 'A';
		
		// creates a blank object
		String blank = null;
		
		// Until letter becomes Z, keep looping.
		// Helps set rows.
		while (letter < 'Z') {
			
			// Set to 0 in every iteration of the outer loop.
			// Creates new columns in each row 
			
			
			// Creates columns until letter equals Z.
			// According to the condition below, they will be 9
			for (int columns = 0; columns < 9; columns++) {
				
				// Ensures only alphabet letters are printed.
				// Else prints nothing.
				if (letter >= 'A' && letter <= 'Z')
					System.out.print(letter + "\t");
				else System.out.println(blank);
				
				// Increments the current letter to the next one.
				++letter;
				
			}
			
			// Ensures three spaces between rows 
			System.out.println("\n\n");
			
		}	
		
	}
}