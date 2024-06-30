package apjfsa;
import java.lang.String;
import java.util.Scanner;
public class Replace {
	//method tp replace the characters with 'x'
	public static void main(String[] args) {
		
		System.out.println
		("Enter your mobilenumber:");
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		
		
		char arr[] =new char[str.length()];
		arr=str.toCharArray();
		for(int i=0;i<arr.length-4;i++) {
			arr[i]='x';
		}
	    String str1=new String(arr);
		System.out.println(arr);
		
		
      
	}

}
