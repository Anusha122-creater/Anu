package apjfsa;
//program to print maximum and minimum values form Array
public class Array {

	public static void main(String[] args) {
     int []arr= {86,97,100};
     int maxNo=arr[0];
     int minNo=arr[0];
     for(int i=0;i<arr.length;i++) {
    	 if(minNo>arr[i]) {
    		 minNo=arr[i];
    	 }
 
    	
		if(maxNo<arr[i]) {
    		 maxNo=arr[i];
    	 }
		//print the values
	System.out.println("mnimum number is:"+minNo);
	 System.out.println("maximum number is:"+maxNo);


}
}
}
