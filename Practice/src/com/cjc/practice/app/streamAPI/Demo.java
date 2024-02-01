package com.cjc.practice.app.streamAPI;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if (n >= 2 && n <= 5) 
		{
			if (n % 2 == 0) 
			{
				System.out.println("Not Weird");
			}
			System.out.println("Weird");

		} else if (n >= 6 && n <= 20)
		{
			if (n % 2 == 0) 
			{
				System.out.println("Weird");
			}
		
		} else if (n > 20)
		{
			if (n % 2 == 0) 
			{
				System.out.println("Not Weird");
			}
		}

		sc.close();
	}
}
