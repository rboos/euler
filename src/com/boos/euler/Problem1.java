package com.boos.euler;

public class Problem1 {
	public static void main(String[] args) {
		int TempValue = 0;
		
		for(int i=0;i<1000;i++)
		{ 
			if(i % 3 == 0 || i % 5 == 0)
			{
				TempValue = TempValue + i;
			}		
		}
		
		System.out.println("Value =:" + TempValue);
	}

}
