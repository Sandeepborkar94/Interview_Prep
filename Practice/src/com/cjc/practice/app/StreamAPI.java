package com.cjc.practice.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI 
{
	public static void main(String[] args) 
	{
		System.out.println("Hiiiii");

		List<Integer> nList = new ArrayList<>();
		nList.add(123);
		nList.add(145);
		nList.add(154);
		nList.add(145);
		System.out.println("Regular List: " + nList);

		List<Integer> list = Arrays.asList(2, 4, 3, 24, 5, 32, 2, 12, 42, 6);

		for (Integer i : list) {
			System.out.println(i + i);
		}

		List<Integer> list1 = list.stream().map(x -> x + x).collect(Collectors.toList());

		list.stream().map(x -> x + x).forEach(y -> System.out.println(y));

		System.out.println("List with Map() : " + list1);

		List<String> names = Arrays.asList("aaa", "cccc", "ddd", "bbb", "sss");

		List<String> result = names.stream().filter(s -> s.startsWith("s")).collect(Collectors.toList());

//		List<String> sort  = names.stream().sorted().collect(Collectors.toList());
		names.stream().sorted().forEach(u -> System.out.println(u));

//		System.out.println("Sorted elements: "+sort);

		System.out.println("ALL Names : " + names);

		System.out.println("Names starts with S : " + result);
		
		List< Integer> no = Arrays.asList(2,4,6,7,4,3,55);
		int even = no.stream().filter(x->x%2==0).reduce(0, (ans,i)->ans+i);
		
		System.err.println(even);
	}
}
