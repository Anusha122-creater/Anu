package com.collections;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
     //program using LinkedHashSet 
	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<String>();
    //Hash  will not follows sorting order  
		names.add("Shivani");
		names.add("Bhavani");
		names.add("Harini");
		names.add("Malini");
		names.add(null);
		names.add("Dharani");
		names.add(null);
		//Hashset will not allows duplicate values
		//print elements using methods
		System.out.println(names);
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Bhavani"));
	}

}
