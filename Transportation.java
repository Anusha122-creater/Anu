package apjfsa;

public class Transportation {

String name;
public Transportation(String car) {
}

public void Transport(String car) {
	this.name = car;
}

void display() {
 System.out.println("Road transport mode  is selected");
 System.out.println("Name of the vehicle : " + name);
}
}

//Road_Transport inherits from Transport
class Roadtransport extends Transportation {
int wheels;
public Roadtransport(String car, int wheels) {
	super(car);
	this.wheels = wheels;
}

void display() {
super.display();
System.out.println("Number of Wheels: " + wheels);
}
}

//Fourwheeler inherits from Roadtransport
class Fourwheeler extends Roadtransport {
private static final String Car = null;
int capacity;
public Fourwheeler(java.lang.String string, int wheels, int capacity) {
	super(Car, wheels);
	this.capacity = capacity;
}

public void display() {
super.display();
System.out.println("total seats : " + capacity);
}


public class F {
public static void main(String[] args) {
// Creating an object of Fourwheeler class
	Fourwheeler car = new Fourwheeler("Car", 4, 4);

// Print details of the car
	car.display();
}

}
}

