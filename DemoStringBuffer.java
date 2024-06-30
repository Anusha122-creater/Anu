package apj;

import java.lang.String;
//program using String Buffer

public class DemoStringBuffer {

	public static void main(String[] args) {
		
      StringBuffer strbuff=new StringBuffer("Anudip");
      
      System.out.println(strbuff);
      
      strbuff.append(" ngo");
      
      System.out.println(strbuff);
      
      System.out.println(strbuff.reverse());
      
      System.out.println(strbuff.charAt(3));

      System.out.println(strbuff.indexOf("c"));
      
      System.out.println(strbuff.capacity());
      
      StringBuffer strb1=new StringBuffer("Advance programe on java fullstack using Angular");
       
      System.out.println(strb1.capacity());
      strb1.deleteCharAt(8);
      System.out.println(strb1);
      System.out.println(strb1.codePointAt(0));
      
      System.out.println(strb1.compareTo(strbuff));
      StringBuilder strb2=new StringBuilder(strbuff);
      
      
      System.out.println(strb2);
      
      //String str="Java";
      
      }
	
}
