import java.util.*;


class Student{   // making blueprint what was we taking in class - > overview
	int marks;
	String name ;
	int rollno;

	public void study(String subject)   // Function's Method // function inside classes 
	{
		System.out.println("we are studying ->" + subject);
	}
}
public class Main {
	public static void main(String[] args) 
    {	
		// Making first obj 

		Student obj = new Student();
		obj.marks = 10;
		obj.name ="saurabh";
		obj.rollno = 1812213095;
		obj.study("dsa");
		System.out.println(obj.marks + " " +obj.name + " " );
		// making second obj ;
		Student obj2 = new Student();
		obj2.marks = 20 ;
		obj2.name = "Yash";
		obj2.rollno = 1812213108;
		obj2.study("Mathematics");
		System.out.println( obj2.marks + " " + obj2.name);

	}

}