package collections;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueueExample {
  public void pqueue()
  {
	  PriorityQueue<String> pq = new PriorityQueue<>();
//add and offer are the methods to add into the queue  
	pq.add("sunny");
	pq.add("windy");
	pq.add("rainy");
	pq.offer("snowy");	
System.out.println("print the elements in the queue" +pq);

//peek and element methods are used to return the head elements from the queue

System.out.println("head element is : "  + pq.element());	  
System.out.println("head element is : "  + pq.peek());

//poll and remove methods are used to remove the elements
System.out.println(pq.poll());
System.out.println("the elements after removing :"+pq);
Iterator <String>itr = pq.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
  }
	  
	  
	public static void main(String[] args)  
	{
		PriorityQueueExample p1 = new PriorityQueueExample();
		p1.pqueue();
	}
	
	
	
	
	
	
	
	
	
	
	
}
