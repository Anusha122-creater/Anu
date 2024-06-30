
package apj;
//programe using class and object method
public class Car1 
{
	String carname,colour;
	int carprice,carmodelno;
	//print the details of car1
void details()
{
System.out.println("carmodelno is HY75EZJ");
System.out.println("carname is audi" );
System.out.println("carprice is $3M");
System.out.println("colour is black");
}

//creating object for car1
  public static void main (String[] args)
{
car c= new car();
c.model();
c.name();
c.price();
c.colour();
c.name();
}
}


