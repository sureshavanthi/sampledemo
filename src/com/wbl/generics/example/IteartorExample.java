package com.wbl.generics.example;
import java.util.Iterator;
import java.util.ArrayList;
public class IteartorExample {
public void iterate_method() {
ArrayList<String> al = new ArrayList<>();
al.add("sri");
al.add("ram");
al.add("sahasra");
al.add("shiv");
System.out.println("the elements in the list are:" +al);

//traversing the list through iterator
Iterator<String> itr = al.iterator(); 
while(itr.hasNext()) {
	System.out.println(itr.next());
}

}


public static void main(String[] args) {

IteartorExample i = new IteartorExample();
i.iterate_method();
}
}