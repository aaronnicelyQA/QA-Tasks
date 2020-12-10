package com.qa;

public class Runner {
	
	public static void main(String[] args)
	{
		printResultsForTask1();
	}
	
	/*
	 * Factorial (Task 1)
	 */
	private static void printResultsForTask1()
	{
		Factorials factorial = new Factorials(120);
		int result = factorial.getFactorial();
		System.out.println("Answer: " + (result==0 ? "Non" : result));
		factorial.setNumber(3628800);
		int result2 = factorial.getFactorial();
		System.out.println("Answer: " + (result2==0 ? "Non" : result2));
		factorial.setNumber(479001600);
		int result3 = factorial.getFactorial();
		System.out.println("Answer: " + (result3==0 ? "Non" : result3));
		factorial.setNumber(6);
		int result4 = factorial.getFactorial();
		System.out.println("Answer: " + (result4==0 ? "Non" : result4));
		factorial.setNumber(18);
		int result5 = factorial.getFactorial();
		System.out.println("Answer: " + (result5==0 ? "Non" : result5));
	}

}
