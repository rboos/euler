package com.boos.euler;

public class Problem4_LargestPalindrome 
{
	
	/*
	 * A palindromic number reads the same both ways. The largest palindrome made 
	 * from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers. 
	 */
	
	public static void main(String[] args) 
	{
		int tempValue = 0;
		int tempStoreageLargestPalindrome = 0;		
		String stringComparitor = "0";
				
		for(int i = 100;i <= 999; i++)
		{
			for(int h = 100;h <= 999; h++)
			{
				tempValue = i * h;
				
				stringComparitor = Integer.toString(tempValue);
				
								
				if(("").equals(stringComparitor.substring(5))
					&& (stringComparitor.substring(0,1)).equals(stringComparitor.substring(4,5))
					&& (stringComparitor.substring(1,2)).equals(stringComparitor.substring(3,4)))
				{					
					if( tempValue > tempStoreageLargestPalindrome )
					{
						tempStoreageLargestPalindrome = tempValue;
					}
				}
				else if((stringComparitor.substring(0,1)).equals(stringComparitor.substring(5))
						&& (stringComparitor.substring(1,2)).equals(stringComparitor.substring(4,5))
						&& (stringComparitor.substring(2,3)).equals(stringComparitor.substring(3,4)))
				{
					if( tempValue > tempStoreageLargestPalindrome )
					{
						tempStoreageLargestPalindrome = tempValue;
					}
				}
				
				if(i == 999 && h == 999)
				{
					System.out.println("Largest Palindrome: " + tempStoreageLargestPalindrome);
				}
				
			}			
		}
		
		System.out.println("Process Completed...");	
		
	}

}
