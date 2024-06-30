package apj;

class Employee {
	
private String name;
private int empId;
private String position;

public Employee(String name, int empId, String position) {
	
this.name = name;
this.empId = empId;
this.position = position;
}

@Override
public String toString() {
	
    return "Name: " + name + ", Employee ID: " + empId + ", Position: " + position;
 }
}

public class Main {
	
public static void main(String[] args) {
       
Employee[] employees = new Employee[3];

// Initialize Employee objects and add them to the array

employees[0] = new Employee("Anusha", 1001, "Manager");
employees[1] = new Employee("Devika", 1002, "Developer");
employees[2] = new Employee("Sowmya", 1003, "Analyst");

// Print details of each employee
   int i;
   
   for (i=0;i<3;i++) {
	   
     System.out.println(employees[i]);
        }
    }
}
	