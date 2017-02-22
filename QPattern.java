package com.pattern;

public class QPattern {
	public  static void main(String[] args)
	{
	for (int i = 0; i <8; i++)
	{
	
		for (int j = 0; j <=7; j++) 
		{
			if((i==0&&j!=0&&j!=5&&j<5)||(i==4&&j!=0&&j!=5&&j<5)||(j==0&&i!=0&&i!=4&&i<4)||(j==5&&i!=0&&i!=4&&i<4)||(i==j))
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
