package com.boos.euler;

public class Problem2_Fibonacci {
	
	public static void main(String[] args) 
	{
		int resultOne = 0;
		int resultTwo = 1;
		int outcome = 0;
		int evenValuedTerms = 0;
		
		do
		{
			outcome = resultOne + resultTwo;
			resultOne = resultTwo;
			resultTwo = outcome;
			
			if(outcome % 2 == 0)
			{
				evenValuedTerms += outcome;
			}
		}while(outcome < 4000000);
		
		System.out.println("evenValuedTerms:" + evenValuedTerms);

	}

}
