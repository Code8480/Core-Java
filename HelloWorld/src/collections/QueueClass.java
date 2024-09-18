package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
	
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue(List.of("Java", "Python", "Mathematics"));
		LinkedList lq = new LinkedList(List.of("Java", "Python", "Mathematics"));
		pq.add("A");
		pq.offer("C");
		pq.add("A");
		pq.offer("B");
		lq.add(100);
		System.out.println(lq);
		
		System.out.println(pq);
		
		pq.offer("Department");
		
		System.out.println(pq.peek());
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------------------");
		for (Object s : pq) {
			System.out.println(s);
		}
		
		
	}

}
