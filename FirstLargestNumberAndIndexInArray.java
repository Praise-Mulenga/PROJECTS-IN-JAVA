package myFirstProgram.java;

import java.util.Scanner;

import java.util.Arrays;

// This is a simple program that finds the first largest number in an array and its index
// In this code, we find the first greatest years of experience in an array of applicants according to the order of application

public class FirstLargestNumberAndIndexInArray {
	
	public static void main (String[] args) {
		
		int[] yearsOfExperience = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		
		System.out.println (Arrays.toString(firstLargestNumberAndIndexGenerator(yearsOfExperience)));
	}
	
	public static int[] firstLargestNumberAndIndexGenerator (int[] yearsOfExperience) {
		
		int largestNumber = -1, indexOfLargestNumber = 0;
		
		for (int i = 0; i < yearsOfExperience.length; i++) {
			
			if (largestNumber < yearsOfExperience[i]) {
				
				for (int j = i + 1; j < yearsOfExperience.length; j++) {
					
					if (yearsOfExperience[i] >= yearsOfExperience[j]) {
						largestNumber = yearsOfExperience[i];
						indexOfLargestNumber = i;
					} else {
						largestNumber = yearsOfExperience[j];
						indexOfLargestNumber = j;
						i = j - 1;
						break;
					}
				}
			} else continue;
		}
		
		return new int[] {largestNumber, indexOfLargestNumber};
		
	}
	
}