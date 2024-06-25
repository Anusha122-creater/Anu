package apj;
import java.util.ArrayDeque;

public class DemoArrayDeque  {

 public static void main(String[] args) {
	 String que=new String("Names");
	 System.out.println(que);
	 
    ArrayDeque queue = new ArrayDeque();
   //add values to queue
    queue.add("Sandya");
    queue.add("Aruna");
    queue.add("Jalaja");
    queue.add("Moksha");
	//print the values using poll and peak methods	 
    System.out.println(queue);
	System.out.println(queue.poll());
    System.out.println(queue.peek());
    String que1=new String("Collection of Names");
    queue.addFirst("Vasanti");
    queue.add("Sakhi");
    System.out.println(que1.compareTo(que));
   
    queue.add("Kavya");
    System.out.println(queue);
  }

}


