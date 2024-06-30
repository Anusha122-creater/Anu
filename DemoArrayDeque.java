package com.collections;

import java.util.ArrayDeque;

public class DemoArrayDeque  {
    public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<String>();
	    //add values to queue
		 queue.add("Sandya");
		 queue.add("Aruna");
		 queue.add("Jalaja");
		 queue.add("Moksha");
		 //print the values using poll and peak methods	 
		 System.out.println(queue);
	     System.out.println(queue.poll());
		 System.out.println(queue.peek());
		 System.out.println(queue);
		 System.out.println(queue.size());
		 System.out.println(queue.remove("Aruna"));
		 System.out.println(queue.isEmpty());
		 System.out.println(queue.pop());
		
		 System.out.println(queue);
    }

}

	


