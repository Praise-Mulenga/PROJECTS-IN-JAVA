// This is a simple program that adds numbers in an array of integers 

public class SumOfNumbersInArray {

	public static int sumGenerator (int[] numberCollection, int size) {

		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum += numberCollection[i];
		}

		return sum;
	}

	public static void main (String[] argv) {

		int[] numberCollection = new int[] { 5, 19, 3, 1, 33};
		
		int sumOfNumbers = sumGenerator (numberCollection, 5);

		System.out.print ("Sum of numbers in an array = " + sumOfNumbers);
		
	}
}