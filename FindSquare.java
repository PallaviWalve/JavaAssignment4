package javaassignment4;

import java.util.Scanner;

public class FindSquare 
{
		public static void main(String[] args) 
		{
			System.out.println("Enter the Number");
			
			Scanner sc=new Scanner(System.in);
			try {
			String num=sc.next();
			int num1=Integer.parseInt(num);//convert into string into integer
			int square=num1*num1;
			
			System.out.println("Square of given number : "+square);
			}
			catch (Exception e)
			{
				System.out.println("Invalid Number");
				System.out.println(e.getMessage());
			}
			finally
			{
				sc.close();
			}
			
		}

	}

