package com.wbl.generics.example;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> vec = new Vector<>(4);
System.out.println("The size is " +vec.size());
System.out.println("The initial capacity is " +vec.capacity());
vec.add("Tiger");
vec.add("Lion");
//legacy method to add the elements
vec.addElement("Elephant");
vec.addElement("Panda");
System.out.println("The elements after adding are" +vec);
//to check if the particular element is present or not
if(vec.contains("Tiger"))
{
	System.out.println("Tiger is present at index " +vec.indexOf("Tiger"));
}

else {
	System.out.println("Tiger is not present");
}
System.out.println("The first element of the vector is" +vec.firstElement());
System.out.println("The last element of the vector is " +vec.lastElement());
	
}
}