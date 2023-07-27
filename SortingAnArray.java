import java.util.*;

// This is a simple program which sorts numbers in an array of integers

public class SortingAnArray {

	static int[] numberSortingMachine (int[] unsortedNumberArray, int size) {

		int temporalIndexValueHolder = 0;

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				if (unsortedNumberArray[i] > unsortedNumberArray[j]) {
					temporalIndexValueHolder = unsortedNumberArray[i];
					unsortedNumberArray[i] = unsortedNumberArray[j];
					unsortedNumberArray[j] = temporalIndexValueHolder;
				}
			}
		}

		return unsortedNumberArray;

	}

	public static void main (String [] argv) {

		int[] unsortedNumbers = new int [] {9, 3, 1, 10, 2};

		System.out.print("Unsorted Numbers: { ");
		
		for (int j = 0; j < 5; j++) {

			System.out.print (unsortedNumbers[j] + " ");

		}

		System.out.print ("}");	

		unsortedNumbers = numberSortingMachine (unsortedNumbers, 5);

		System.out.println();

		System.out.print ("Sorted Number: { ");

		for (int i = 0; i < 5; i++) {

			System.out.print(unsortedNumbers[i] + " ");

		}

		System.out.print("}");

	}

}