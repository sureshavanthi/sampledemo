package com.wbl.generics.example;

public class WrapperExample1 {

	public static void main(String[] args) {
		
//program to convert object to primitives
		
		Integer a = new Integer(3);
		int i = a.intValue(); //converts Integer to int explicitly
		int j = a; //compiler writes a.intvalue() internally
System.out.println(a + " " + i + " " +j );		
	}

}
