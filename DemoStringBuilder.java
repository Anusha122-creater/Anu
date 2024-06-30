package apj;

//program using String Builder
public class DemoStringBuilder {

	public static void main(String[] args) {
		
		
		StringBuilder strb=new StringBuilder("Hello world");
		
		System.out.println(strb);
		
		System.out.println(strb.length());
		
		System.out.println(strb.indexOf("H"));
		
		String s=strb.toString();
		
		System.out.println(s);
		
		StringBuffer strb1=new StringBuffer(strb);
		
		System.out.println(strb1);
		
	}

}
