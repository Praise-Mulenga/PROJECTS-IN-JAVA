package myFirstProgram.java;

import java.util.*;

public class SortingAndRemovingDuplicatesFromArray {
    
	public static void main(String[] args) {
		int[] numArray = {12, 1, 1, 15, 12, 8, 9, 2, 20, 6, 8, 6, 1, 10, 3, 5, 5, 8, 2, 2, 10};

		sortArray(numArray);

		System.out.println(Arrays.toString(removeDuplicate(numArray)));
	}
    
    public static int[] sortArray(int[] numArray) {
        int temp = 0;

        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] > numArray[j]) {
                    temp = numArray[i];

                    numArray[i] = numArray[j];

                    numArray[j] = temp;
                }
            }
        }
        return numArray; // Returns sorted array with duplicates adjacent to each other 
    }
    
    public static final int size(int[] numArray) {
         int count = 0;

         for (int i = 0, j = i + 1; i < numArray.length && j < numArray.length; i++, j++) {

             if (numArray[i] == numArray[j]) // Finds duplicates. 
                 count += 1; // Counts the number of duplicates.
             else continue;
         }
 
         count = numArray.length - count; // Finds the actual size of the array without duplicates 

         return count; // size of array without duplicates 
     }
    
	// Removes duplicates from the original sorted array
    public static int[] removeDuplicate(int[] numArray) {

        int[] noDuplicateArray = new int[size(numArray)]; // New array to store numbers of previous array, without duplicates.

        for (int i = 0, k = 0, j = i + 1; i < numArray.length && j <= numArray.length; i++, j++) { // Note: k is the index variable of the new array
        	
        	// Checks if a number at a particular index is duplicate to its next adjacent number in the array
        	if (numArray[i] != numArray[j]) {
        		noDuplicateArray[k] = numArray[i];

                k++;

		        if (j == numArray.length - 1) {
		        	noDuplicateArray[k] = numArray[j];	// Stores last element of the original array into last index of the new array
		        	break;
		        }
             }
        	else {
        		
        		// In case the last two digits are equal 
        		if (j == numArray.length - 1) {
		        	noDuplicateArray[k] = numArray[j];	// Stores last element of the original array into last index of the new array
		        	break;
		        }
        		continue;
        	}
        }
        
        return noDuplicateArray; // Returns a new sorted array without duplicate numbers
    }
}