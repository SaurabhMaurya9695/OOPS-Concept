import java.util.*;

// class is nothing but a colletion of data members and instanc varibale in a single entity
class Student{   // making blueprint what was we taking in class - > overview
	int marks;
	String name ;
	int rollno;
}
public class Main {
	public static void main(String[] args) {
		
		// By doing this  we have to make array  and initalize array

		// int[] marks = new int[4];
		// marks[0] = 1;
		// marks[1] = 2;
		// marks[2] = 3;
		// marks[3] = 4;

		// String[]  name = new String[4];
		// String[0] ="Saurabh";
		// String[1] ="Maurya";
		// String[2] ="Yash";
		// String[3] ="vikas";
		
		// Making first obj 
		// Memory allocted from here ,,, instance is called object
		Student obj = new Student();  //instance created;
		obj.marks = 10;
		obj.name ="saurabh";
		obj.rollno = 1812213095;

		// making second obj ;
		Student obj2 = new Student();
		obj2.marks = 20 ;
		obj2.name = "Yash";
		obj2.rollno = 1812213108;

		System.out.println(obj.marks + " " +obj.name + " " +obj2.marks + " " + obj2.name);

	}

}