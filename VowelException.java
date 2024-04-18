package javaassignment4;

import java.util.Scanner;

	class NoVowel extends Exception//user define exception
	{
		public NoVowel(String msg)
		{
			super(msg);
		}
	}
	public class VowelException
	{
		public static void VowelException(String input) throws NoVowel//for throw particular exception
		{
			boolean containVowels=false;
			String vowel="aeiouAEIOU";
			
			for(int i=0;i<input.length();i++)
			{
				char test= input.charAt(i);
				if(vowel.contains(String.valueOf(test)))
				{
					containVowels=true;
					break;
				}
				
			}
			
			if(!containVowels)
			{
				throw new NoVowel("This string not contains any vowel");
			}
		}
		public static void main(String[] args)
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			try
			{
			String input=sc.next();
			VowelException(input);
			System.out.println("This string contains vowel");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}	
				
		}

	}


