package com.collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		int a;
		list.add(10);
		list.add(20);
		list.add(30);
		list.add('a');
		list.add(3.14);
		list.add("Anusha");
		System.out.println(list);
		list.add(true);
		list.add(1,2);
		
		System.out.println(list);
		list.set(2,4);
		System.out.println(list);
		list.add(30);
		list.add(40);
		System.out.println(list);
		//print the values using methods
		System.out.println(list.indexOf(20));
		System.out.println(list.contains(1));
		System.out.println(list.get(0));
		System.out.println(list.lastIndexOf(20));
		System.out.println(list.size());
		System.out.println(list.remove(2));
		System.out.println(list.lastIndexOf("Anusha"));
		System.out.println(list);
		System.out.println(list.remove(3.14));
		System.out.println(list);
		List l=new ArrayList();
		System.out.println(list.isEmpty());
		l.add(1);
		l.add(2);
		l.add(3);
		l.addAll(list);
		System.out.println(l);
		System.out.println(l.toArray());
		
	}
	}
		


		