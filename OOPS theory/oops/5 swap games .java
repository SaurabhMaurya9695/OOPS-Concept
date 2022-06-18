import java.util.*;


class Student{   // making blueprint what was we taking in class - > overview
	int marks;
	String name ;
	int rollno;

	public void study(String subject)   // Function's Method //
	{
		System.out.println("we are studying ->" + subject);
	}
}
public class Main {
    public static void swap4(Student a, Student b)
    {
        Student temp = new Student();
        temp.marks = a.marks;
        temp.rollno = a.rollno;
        
        a.marks = b.marks;
        a.rollno = b.rollno;
        
        b.marks = temp.marks;
        b.rollno = temp.rollno;
    }
    
     public static void swap3(Student a, Student b)
     {
        Student temp = a;
        a.marks = b.marks;
        a.rollno = b.rollno;
        b.marks = temp.marks;
        b.rollno = temp.rollno;
    }
    
     public static void swap2(Student a, Student b){
        Student temp = new Student();
        temp.marks = a.marks ;
        temp.rollno = a.rollno ;
        a = b;
        b = temp;
    }
    
    
    public static void swap1(Student a, Student b){
        Student temp = a;
        a = b;
        b = temp;
    }
    
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
		Student obj = new Student();
		obj.marks = 10;
		obj.name ="saurabh";
		obj.rollno = 1812213095;
// 		obj.study("dsa");
// 		System.out.println(obj.marks + " " +obj.name + " " );


		// // making second obj ;
		Student obj2 = new Student();
		obj2.marks = 20 ;
		obj2.name = "Yash";
		obj2.rollno = 1812213108;
// 		obj2.study("Mathematics");
// 		System.out.println( obj2.marks + " " + obj2.name);

        // before calling swap function
        System.out.println(" before calling") ;
        System.out.println(obj.marks + " " +obj.rollno );
        System.out.println(obj2.marks + " " +obj2.rollno  );
        
     // changes inside heap is called deep copy or changes inside stack is called shallow copy
//   swap function calling 
        // swap1(obj, obj2);
        // swap2(obj , obj2);
        // swap3(obj , obj2);  50per swapping done   
        // swap4(obj , obj2); // fully swapping 
        System.out.println(" after calling") ;
        System.out.println(obj.marks + " " +obj.rollno );
        System.out.println(obj2.marks + " " +obj2.rollno  );

	}

}