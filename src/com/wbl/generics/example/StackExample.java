package com.wbl.generics.example;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stack <Integer> stk = new Stack <Integer>();
//pushing elements into stack
stk.push(12);
stk.push(31);
stk.push(22);
System.out.println("The elements in stack are " +stk);
//popping elements from the stack		
stk.pop();
stk.pop();
stk.pop();
System.out.println("The elements after popping are:" +stk);
		
		
		
		
		
		
		
		
		
	}

}
