package apj;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		int num;
		System.out.println("enter a number");
		//reading input for num from console
		
		 Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//check given number is even or odd
		
		
		if(num % 2==0)
		System.out.println(num + " is a even number");
		else
			System.out.println(num + " is a odd number");
	

	}

}
