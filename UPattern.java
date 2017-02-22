package com.pattern;

public class UPattern {

	
	public  static void main(String[] args)
	{
	for (int i = 0; i <5; i++)
	{
	
		for (int j = 0; j <=5; j++) 
		{
if((j==0&&i!=4)||(j==5&&i!=4)||(i==4&&j!=0&&j!=5))
			{
            System.out.print("* ");	
			}
			else
			{
			System.out.print("  ");
			}
		}System.out.println(""); 
	
	}
	
}
	
}
