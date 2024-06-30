package com.collections;

import java.util.HashMap;

public class DemoHashMap1 {


		public static void main(String[] args) {
			// Creating HashMap
			// key-->Integer value-->String
			HashMap<Integer, String> stu = new HashMap<Integer,String>();

			// Adding keys and values to map
			stu.put(1,"Canada");
			stu.put(91,"India");
			stu.put(86, "Thailand");
			stu.put(93, "Afganistan");
			stu.put(92, "Pakistan");

			System.out.println(stu);
			// printing key
			System.out.println(stu.keySet());
			// printing values
			System.out.println(stu.values());
			// using replace
			stu.replace(2,"America");
			System.out.println(stu);
			// using remove
			System.out.println(stu.remove(92));
			System.out.println(stu);
			stu.putIfAbsent(93, "Pakistan");
			System.out.println(stu);
		}

	}

	