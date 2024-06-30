package apjfsa;

//program to find the result of the student usimg marks
	public class StudentResult1 {

		public static void main(String[] args) {
			
	        int i=0;
			int[] marks= {78,98,90,45,67,87};
			boolean b=true;
			int i1=0,sum=0;
			double percentage;
			
			
			for(;i1<marks.length;) {
				if(marks[i1]<=35)
					b=false;
				i1++;
			}
			//if condition is true then print pass and show the result of marks
			if(b) {
				for(i1=0;i1<marks.length;i1++ ) {
					sum+=marks[i1];
				}
				percentage=sum/6;
				System.out.println("Student Result:Passed:\nTotal="+sum+" percentage="+percentage);
			}
			//else condition is true then print fail 
			else
			{
				System.out.println("Student got failed");
			}

		}
	}
	


