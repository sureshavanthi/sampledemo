package com.wbl.generics.example;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList1 {
	
    public void link_method() {
LinkedList<String> l1 = new LinkedList<>();
System.out.println("initial list is" +l1);
l1.add(" Dan");
l1.add("Ron");
l1.add(1,"tom");
System.out.println("after invoking add method is" +l1);
LinkedList<String> l2 = new LinkedList<>(); 
l2.add("Dion");
l2.add("Danny");
l1.addAll(l2);
System.out.println("after adding list2 is" +l1);
l1.addFirst("kevin");
l1.addLast("sara");
System.out.println("final elements in the list are" +l1);
Iterator<String> itr = l1.iterator();
while(itr.hasNext()) {
    System.out.println(itr.next());
}
    }	
public static void main(String[] args)
{
LinkedList1 ll = new LinkedList1();
ll.link_method();
}
}