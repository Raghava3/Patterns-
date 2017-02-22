package com.pattern;

public class VPattern {
	public  static void main(String[] args)
	{
	for (int i = 0; i <5; i++)
	{
	
		for (int j = 0; j <=5; j++) 
		{
if((i==j&&j<3)||((i+j)==4&&j>2))
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
