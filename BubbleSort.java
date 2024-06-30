package apjfsa;

public class BubbleSort {

	

	    public static void main(String[] args) {
	        int[] arr = {3, 2, 8, 7, 6};
	        
            int i,j;
	        // Bubble sort algorithm
	        for ( i = 0; i < arr.length- 1; i++) {
	            for ( j = 0; j < arr.length - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Print the sorted array
	        System.out.println("Sorted array:");
	        for(i=0;i<arr.length-1;i++) {
	           
	        System.out.println(arr[i]+" ");
	    }
	}
}