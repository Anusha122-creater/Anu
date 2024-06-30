package apj;

public class DemoArithmaticExe {

	public static void main(String[] args) {
		int a,b,c;
		a=15;
		b=15;
		System.out.println("Start of the program");
		//try block contain a set of statements where an exception can occur
        try {
		c=a/b;
		System.out.println("c=" +c);
		//System.out.println("End of the program");
		
		int arr[]= {1,2,3};
		System.out.println(arr[2]);
		
        }catch(ArithmeticException ae) {
        	System.out.println("Exception caught ");
        }
      //catch block is used to handle the uncertain condition of a try block
        catch(ArrayIndexOutOfBoundsException ae){
        	System.out.println("Array exception caught");
        }
      //finally  block is used to put some common code when there are multiple catch blocks
        finally {
        System.out.println("End of the program");
        }
        
	}

}
