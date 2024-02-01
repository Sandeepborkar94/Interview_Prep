package com.cjc.practice.app;

public class ConcatTest 
{
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();
		
		StringBuffer stringBuffer = new StringBuffer("JAVA");
		for (int i = 0; i < 100000000; i++) 
		{
			stringBuffer.append("Tpoint");
		}
	
		System.out.println("Time taken by String buffer: "+(System.currentTimeMillis()-startTime+"ms"));
		
		startTime = System.currentTimeMillis();
		
		StringBuilder stringBuilder = new StringBuilder("JAVA");
		for (int i = 0; i < 100000000; i++) 
		{
			stringBuilder.append("Tpoint");
		}
	
		System.out.println("Time taken by String Builder: "+(System.currentTimeMillis()-startTime+"ms"));
		
	}

}
