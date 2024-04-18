package javaassignment4;

import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;

	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Number should not be negative");
		}
		return num1 + num2;
	}

	public int sub() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Number should not be negative");
		}
		return num1 - num2;
	}

	public int mul() {
		if (num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Number should not be zero");
		}
		return num1 * num2;
	}
	
	public double div() {
		if (num2 == 0) {
			throw new ArithmeticException("Denominator should not be zero");
		}
		return (double)num1 / num2;
	}


	public static void main(String[] args) 
	{

		System.out.println("Enter two Numbers");
		Scanner sc=new Scanner(System.in);
		try
		{
		String num1=sc.next();
		String num2=sc.next();
		
		Calculator obj=new Calculator(Integer.parseInt(num1),Integer.parseInt(num2));
		                             //convert string into integer
		
		System.out.println("Addition       : "+obj.add());
		System.out.println("Subtraction    : "+obj.sub());
		System.out.println("Multiplication : "+obj.mul());
		System.out.println("Division       : "+obj.div());
		}
		catch (NumberFormatException e)
		{
			System.out.println("Please enter only Integer value");
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
