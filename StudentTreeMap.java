package apj;

import java.util.Map.Entry;
import java.util.TreeMap;

public class StudentTreeMap {
	public static void main(String[] args) {
    // Create a TreeMap to  students with roll numbers
	TreeMap<Integer, Student> studentMap = new TreeMap<>();
    // Insert student objects into the TreeMap
	studentMap.put(1, new Student(1, "Anusha", 43));
	studentMap.put(2, new Student(2, "Kavya", 51));
    studentMap.put(3, new Student(3, "Charu", 21));
    studentMap.put(4, new Student(4, "Aadhya", 34));
    studentMap.put(5, new Student(5, "Nandini", 62));

	System.out.println("Student Map: " + studentMap);

	// Access student by roll number
	int rollNumber = 32;
    System.out.println("Student with roll number " + rollNumber + ": " + studentMap.get(rollNumber));
    listAllStudents(studentMap);
    removeStudent(studentMap, 21);

    // Check if  student exists by roll number
	boolean exists = containsStudent(studentMap, 8);
	System.out.println("Does student with roll number 2 exist? " + exists);
	 }

	// Method to remove  student by roll number
	public static void removeStudent(TreeMap<Integer, Student> map, int rollNumber) {
    map.remove(rollNumber);
	System.out.println("Student with roll number " + rollNumber + " has been removed. Updated list:   " + map);
	}

	// Method to check if student exists by roll number
    public static boolean containsStudent(TreeMap<Integer, Student> map, int rollNumber) {
	return map.containsKey(rollNumber);
	}

    // Method to list all students
 	public static void listAllStudents(TreeMap<Integer, Student> map) {
 	System.out.println("List of all students:");
 	for (Entry<Integer, Student> entry : map.entrySet()) {
 	System.out.println("Roll Number: " + entry.getKey() + ", " + entry.getValue());
 	}
 	}  
}



