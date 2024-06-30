package apj;

import java.util.Scanner;

public class Palindrome2 {
	
public static void main(String[] args) {

			String str="mom";// check different palindromes		
			if(ispalindrome (str)) {
			    	System.out.println(str+" is a palindrome");
			}
			    else
			    {
			    	System.out.println(str+" is not a palindrome");
			    }
				}
	public static boolean ispalindrome(String str) {
		    
		 
		
		   int left = 0;
		   int right =str.length() - 1;
		    while(left<right)
		    {
		    	
		    if(str.charAt(left)!=str.charAt(right))
		    	return false;
		    
	            left++;
		    	right--;
		     
		    }	
		    return true;
		    
		   }
}
