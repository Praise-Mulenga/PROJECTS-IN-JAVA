// This is a simple program that computes tax and the net income of a user from the gross income entered
import java.util.Scanner;

public class Tax 
{
	public static void main(String[] argv) 
	{
		Scanner input = new Scanner(System.in);

		double income, tax = 0.0;
		final double taxFree_threshold = 4000.00, taxBracket = 6800.00, higherTaxBracket = 8900.00; // chargeable income limits 
		final double taxFree_rate = 0.0, lowerTax_rate = 0.20, intermediateTax_rate = 0.30, higherTax_rate = 0.375; // tax rates 

		// Prompts user to enter gross income
		System.out.print("Enter your gross income: ");
		income = input.nextDouble();

		if (income <=  taxFree_threshold) 
		// First chargeable income range - tax free

			tax = income * taxFree_rate;
		else if (income > taxFree_threshold && income <= taxBracket) 
		// Second chargeable income range

			tax = (income - taxFree_threshold) * lowerTax_rate + (taxFree_threshold * taxFree_rate);
		else if (income > taxBracket && income <= higherTaxBracket) 
		// Third chargeable income range

			tax = (income - taxBracket) * intermediateTax_rate + (taxBracket - taxFree_threshold) * lowerTax_rate + (taxFree_threshold * taxFree_rate);
		else if (income > taxFree_threshold) 
		// Fourth chargeable income range
		
			tax = (income - higherTaxBracket) * higherTax_rate + (higherTaxBracket- taxBracket) * intermediateTax_rate + (taxBracket - taxFree_threshold) * lowerTax_rate + (taxFree_threshold * taxFree_rate);

		// Displays the gross tax and computes the net income 
		System.out.println("Gross Tax: " + tax + "\nNet Pay: " + (income - tax));

		input.close();

	}
}