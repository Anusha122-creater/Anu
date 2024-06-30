package com.collections;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		//program using Trees
		TreeSet<String> ts= new TreeSet<String>();
		//Treeset will not allow duplicate values
         ts.add("India");
         ts.add("America");
         ts.add("Indonasia");	
	     System.out.println(ts);
	     ts.add("Pakistan");
	     ts.add("China");	
	     ts.add("America");
	     System.out.println(ts);
	    //Treeset follows sorting order
	     //print elements using methods
	      System.out.println(ts.first());
	      System.out.println(ts.size());
	      System.out.println(ts.last());
	      System.out.println(ts.pollFirst());
	      System.out.println(ts.descendingSet());
	      System.out.println(ts.toString());
	      System.out.println(ts.getClass());
	}

}
