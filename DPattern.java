package com.pattern;

public class DPattern {

	
	public  static void main(String[] args)
	{
		for (int i = 0; i <5; i++)
		{
		
			for (int j = 0; j <=5; j++) 
			{
	if((i==0&&j!=5)||(i==4&&j!=5)||j==0||(j==5&&i!=0)	&&(j==5&&i!=4))
				{
	            System.out.print("* ");	
				}
				else
				System.out.print("  ");
				
			}System.out.println(""); 
		
		}
		
	}
}
