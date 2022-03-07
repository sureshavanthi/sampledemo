package com.wbl.generics.example;

public class WrapperExample {
//program to convert primitive to objects(autoboxing example)
	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		int a = 20;
		Integer i = Integer.valueOf(a);//converts int to Integer explicitly
		Integer j = a;//compiler writes Integer.valueof(a) internally(autoboxing)
	System.out.println(a + " " +i + " " +j);	

	

	

	
	
	
	}	
	
}






