package apjfsa;
import java.lang.String;
public class DemoString {

	public static void main(String[] args) {
       //String declaration using literal
		String name="Anudip";
		
		System.out.println(name);
		//Defining String using constructor
		
		String course=new String("APJFSA course");
		System.out.println(course);
		
		char[] courseType= {'a','w','s'};
	    //Defining String using character array
		Object course1=new String(courseType);
		
		System.out.println(course1);
		System.out.println(name.concat("Foundation"));
		 
		 name="Anudip Foundatiom";
		System.out.println(name);
		System.out.println(name.charAt(15));
		System.out.println(name.indexOf('n'));
		System.out.println(name.lastIndexOf('n'));
		System.out.println(name.indexOf('n',2));
		System.out.println(name.length());
		System.out.println(name.contains((CharSequence) course1));
		System.out.println(name.indexOf('c'));
		System.out.println(name.equals(course1));
		
		java.lang.String name1="anudip foundation";
		
	
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareToIgnoreCase(name1));
		System.out.println(name.equalsIgnoreCase(name1));
	}
}




