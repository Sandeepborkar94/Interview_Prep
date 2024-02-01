package com.cjc.practice.app;

public class String_Pool
{
	
	public static void main(String[] args)
	{
//		String first_name = "Sandeep";
//		first_name=first_name.concat("Borkar");
//		System.out.println(first_name);

		String s1 = "Sandeep";
		String s2 = "Sandeep";

		String s3 = new String("Sandeep").intern();
		String s4 = new String("Sandeep").intern();

		for (int i = s1.length() - 1; i >= 0; i--)
		{
			System.out.print(s1.toUpperCase().charAt(i) + " ");
		}

		StringBuffer stringBuffer = new StringBuffer("String");
		
		stringBuffer.append("Buffer");
		
		System.out.println(stringBuffer);
		
		
		StringBuilder stringBuilder = new StringBuilder("String");
		stringBuilder.append("Builder");

		System.out.println(stringBuilder);

		System.out.println(s1 == s2);

		System.out.println(s1 == s3);

		System.out.println(s3 == s4);

	}
}
