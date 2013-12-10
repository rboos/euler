package com.boos.euler;

public class Problem3_LargestPrimeNumber {

	/**
	 * Largest Prime Factor
	 */
	public static void main(String[] args) {

		long remainingLongValue = 600851475143L;
		
		for (long i = 2; i <= remainingLongValue; i++) 
		{
			if ((i == 2 || i == 3 || i == 5 || i == 7)
			|| !(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)) 
			{
				if (remainingLongValue % i == 0) 
				{
					remainingLongValue = remainingLongValue / i;
					System.out.println("remainingLongValue: "
									 + remainingLongValue
									 + " :Prime Number Value: " + i);
				}
			}
		}

	}

}
