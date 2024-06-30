package com.collections;


import java.util.PriorityQueue;

public class Queues{
   public static void main(String[] args) {
	   //program using Queue methods
	   PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	     queue.add(10);
		 queue.add(20);
		 queue.add(30);
		 queue.add(40);
		
		 //print Queue elements using Queue methods poll and peek
		 System.out.println("Queue Elements are:" +queue);
		 Integer removedElement = queue.poll();
		 System.out.println("Removed element: " + removedElement);
         Integer peekElement = queue.peek();
		 System.out.println("Peeked element: " + peekElement);
		 
		 }
}


