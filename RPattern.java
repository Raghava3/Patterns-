package com.pattern;

public class RPattern {

	public  static void main(String[] args)
	{
		int m=8,n=8;
	for (int i = 0; i <m; i++)
	{
	
		for (int j = 0; j <=n; j++) 
		{

if((j==m/2)||(i==0&&j>n/2)||(j==n&&i<m/2)||(i==n/2&&j>m/2)||((i==j)&&i>m/2))			{
            System.out.print("* ");	
			}
			else
			System.out.print("  ");
			
		}System.out.println(""); 
	
	}
	
}
	
}
