package apj;

import java.util.Scanner;

public class DemoBreak {

	public static void main(String[] args) {
		
	   int withdrawAmount,sumAmount=0,ACbalance=120000;
	   Scanner sc=new Scanner(System.in);
	   while(ACbalance>0) {
	   System.out.println("Enter amount to withdraw:");
	   withdrawAmount = sc.nextInt();
	   
	   sumAmount+=withdrawAmount;//sumamount=sumAmount+am
	   if(sumAmount>50000) {
		   System.out.println("Limit executed");
	       break;
	   }
	   ACbalance=withdrawAmount;
	   System.out.println("A/cbalance=" +ACbalance+" Amount withdrawn:"+sumAmount);
	   
	   }
	

	}


}

