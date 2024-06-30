package com.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	
	int studentId;
	String studentName;
	String qualification;
	

	public Student(int studentId,String studentName,String qualification) {
		super();
		this.studentId=studentId;
		this.studentName=studentName;
		this.qualification=qualification;
	}
	@Override
	public String toString() {
		return "Student [studentId=" +studentId + ", studentName=" + studentName + ", qualification=" + qualification +"]";

	}
	@Override
	public int compareTo(Student o) {
		  
		if(this.studentName.compareTo(o.studentName)>0)
		 return 1;
		else if(this.studentName.compareTo(o.studentName)<0)
			return-1;
		return 0;
	}


 class StudentCollection {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();

		list.add(new Student(322,"Anusha","Bsc"));
		list.add(new Student(322,"Rithika","Bcom"));
		list.add(new Student(762,"Surya","BE"));
	    list.add(new Student(322,"Harshini","Btech"));
	    
        Student s=new Student(456,"Dharani","BCA");
        list.add(s);
        
        for(Student s1:list) {
        System.out.println(s1);
}
        Collections.sort(list);
        System.out.println(list);

        for(Student s1:list) {
        System.out.println(s1);
}
	
	}
}
}

