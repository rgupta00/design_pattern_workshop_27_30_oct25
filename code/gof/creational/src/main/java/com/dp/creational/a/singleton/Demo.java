package com.dp.creational.a.singleton;

public class Demo {

	public static void main(String[] args) {
		//singleton in jdk Runtime, finding avalilable processor
		System.out.println(Runtime.getRuntime().availableProcessors());
		Integer it1=Integer.valueOf(11);
		Integer it2=Integer.valueOf(11);
		System.out.println(it1==it2);
		
	}
}
