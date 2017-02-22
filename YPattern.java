package com.pattern;

public class YPattern {
	public static void main(String[] args)
	{
		{
			for (int i = 0; i <5; i++)
			{
			
				for (int j = 0; j <=5; j++) 
				{
                if((i==j&&i<2)||((i+j)==4))		
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

}
