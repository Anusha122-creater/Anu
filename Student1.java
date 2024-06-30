package apj;
//program using class and object method
import Collections.student;

public class Student1
{
int srno,smobno,smarks;
String sname,scource;
//print the details of student1
void details()

{
System.out.println("srno is=" +10);
System.out.println("sname is  Anusha");
System.out.println("smobno is=" +2121);
System.out.println("scource is Java");
System.out.println("smarks is=" + 98 );
}

//creating object for student1 class
public static void main (String args[])
{
student s=new student();
s.rno();
s.name();
s.mobno();
s.cource();
s.marks();
}
}

