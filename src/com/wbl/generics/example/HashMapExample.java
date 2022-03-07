package com.wbl.generics.example;
import java.util.HashMap;
public class HashMapExample {
    public void hashmethod()
    {
    	
   HashMap<Object,Object> hm = new HashMap<>();
   hm.put(100, "mom");
   hm.put(101, "dad" );
   hm.put(102, "brother"); 
   hm.put(103, "sister");
  System.out.println("The key-value pairs are: " + hm);  	

   System.out.println("The keys of the map :"   +  hm.keySet()); 	
 	System.out.println("The values of the map :"  +  hm.values());
 	
 //checking to see if it allows duplicate keys	
 	hm.put(101,  "grandpa");
   System.out.println("after adding duplicate key :" +hm); 
   
   //to check if a specific key or value is present or not
   System.out.println(hm.containsKey(102));
   System.out.println(hm.containsValue("brother"));
System.out.println(hm.containsKey(104));
    }
	
	
	public static void main(String[] args)
	{
		HashMapExample h1 = new HashMapExample();
		h1.hashmethod();
	}
	
	
	
	
	
	
	
}
