package com.cjc.practice.app;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random r=new Random();
		int x=r.nextInt(1200);
		System.out.println(x);
	}

}
