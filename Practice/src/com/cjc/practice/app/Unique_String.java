package com.cjc.practice.app;

public class Unique_String 
{
	public static void main(String[] args) 
	{
		String name = "sandeep";

		int check = 0;

		for (int i = 0; i < name.length(); i++)
		{
			for (int j = 0; j < name.length(); j++)
			{
				if (name.charAt(i) == name.charAt(j) && i != j)
				{
					check = 1;
					break;
				}
			}
		}
		if (check == 1)
		{
			System.out.println("String does not have unique characters");
		} else 
		{
			System.out.println("String have unique characters");
		}
	}
}
