package apjfsa;

public class MergeArray {
     //merge an array 
	public static void main(String[] args) {
		
           int a1[]= {5,2,8,1,4};
           int a2[]= {3,0,10,9,1};
           int b=a1.length;
           int c=a2.length;
           int d=c+b;
           int a3[]=new int[d];
           for(int i=0;i<a1.length;i++) {
        	   a3[i]=a1[i];
           }
           for(int i=0;i<a2.length;i++) {
        	   a3[b+i]=a2[i];
        	  
           }
           //print the merged array
           for(int i=0;i<d;i++) {
        	   System.out.println(a3[i]);
           }
}
}