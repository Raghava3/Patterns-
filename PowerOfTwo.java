package com.Bridgelabz;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] raghav)
	{
		int n=0;
		int pow=1;
		int d=0;
		Scanner scn=new Scanner(System.in);

		do
		{
			pow=1;
			try{
				System.out.println("Enter the  integer value of n");
				n =scn.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("entered value should be integer");
				break;
			}
			if(n>=0&&n<31)
			{
				System.out.println("the 2^"+n+" value is ");
				for(int i=0;i<n;i++)
				{
					pow=pow*2;
					System.out.println(pow);
				}
			}
			else
			{
				System.out.println("number should be in between 0 to 31");
			}
			try    
			{
				System.out.println("do you want to continue press 1");
				d=scn.nextInt();
			}
			catch(InputMismatchException e )
			{
				System.out.println("thank you");
				System.exit(0);
			}


		}while(d==1);
		scn.close();
		System.out.println("Thank you");
	}


}
