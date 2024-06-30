package apj;

import java.util.Scanner;
//program to print the fibnocciseries
public class Fibnocciseries {

	public static void main(String[] args) {
		 
		int num1,num2,num3,range;
		num1=0;
		num2=1;
		System.out.println("Enter range:");
		Scanner sc=new Scanner(System.in);
		range=sc.nextInt();
		System.out.println(num1+" "+num2);
		int i=0;
		while(i<=range) {
			num3=num1+num2;
			System.out.println(" "+num3);
			num1=num2;
			
			num2=num3;
			i++;
		}

	}

}
