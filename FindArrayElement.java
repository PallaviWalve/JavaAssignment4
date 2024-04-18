package javaassignment4;

import java.util.Scanner;

public class FindArrayElement 
{
		public static void main(String[] args) 
		{
			System.out.println("Enter the size of array");
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int arr[]=new int[size];
			try {
			System.out.println("Enter array Elements");
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Enter the index position from 0 to 4");
			int position=sc.nextInt();
			System.out.println("Value for index "+position+" is : "+arr[position]);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Invalid index positon");
				System.out.println(e.getMessage());
			}
			finally 
			{
				sc.close();
			}
				
		}

	}
