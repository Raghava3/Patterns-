
	package com.Bridgelabz;
	import java.util.InputMismatchException;
	import java.util.Scanner;
	public class Gambler {
		public static void main(String[] args)
		{
			int n=0,goal=0,amt=0,bet=0;
			double w=0,l=0;
			Scanner scn=new  Scanner(System.in);
			try{
			System.out.println("Enter how much amount you have");
			 amt=scn.nextInt();
			System.out.println("Enter the goal ");
			 goal=scn.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("sorry you have  entered different value ");
				System.exit(0);
			}
			do{
				if(goal<=amt)
				{
				goal=goal+amt;
				}
				try{
				System.out.println("enter the bet");
				bet=scn.nextInt();
				}
				catch(InputMismatchException e)
				{
					System.out.println("sorry you have  entered different value ");
					System.exit(0);
				}
				if(amt<bet)
				{
					System.out.println(" sorry your  bet excedss your current balance");
			     	System.exit(0);
				}
				else
				{	
					n++;


					double j=Math.random();
					if(j>0.5)
					{ 
						w++;
						amt=amt+bet;
						System.out.println("congrats u have won "+bet+"total amt is "+amt);
					}
					else
					{ 
						l++;
						amt=amt-bet;
						System.out.println("sry  u have lost  "+bet+" total amt is "+amt);

					}
				}
		
			}while((amt!=0)&&(amt<goal));
			if(amt==goal)
			{
				System.out.println("congrts u have reached u r goal");
			}
			else
			{
				System.out.println("sorry u have losed u r amount");
			}
			System.out.println("total play is "+n);
			System.out.println("win % is "+((w/n)*100));
			System.out.println("loss % is "+((l/n)*100));
		}


	}
	

		
	



