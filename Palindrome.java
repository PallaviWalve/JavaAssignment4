package javaassignment4;

import java.util.Scanner;

public class Palindrome {

	    public static void isPalindrome(String str)
	    {
	        String rev = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }

	        if (str.equals(rev)) 
	        {
	           System.out.println("String is Palindrome");
	        }
	        else
	        {
	        	 System.out.println("String is not Palindrome");
	        }
	       
	    }
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter String");
	        String str = sc.next();
	        str = str.toLowerCase();
	        isPalindrome(str);
	        
	    }
	}
