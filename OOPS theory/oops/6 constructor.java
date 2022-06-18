import java.util.*;


class Student{   // making blueprint what was we taking in class - > overview
	int marks;
	String name ;
	int rollno;
	
	// implicit const with default paraemeter value zero for int and null for string 
	Student(){
	    // garbage value
	    
	}
	
	// explicit constructor ----- return type "this" which was hidden 
	Student()    // same as class name and with no return type is called constructor ...
    {
        marks = 100 ;
        name = "saurabh's constructor";
        rollno  = -1 ;
        System.out.println("hey the consturctor of student class is created");
    }


    Student(int newmarks , String newname , int newrollno)   // parametrize constrcutor
    {
        marks = newmarks ;
        name =  newname ;
        rollno = newrollno ;
    }
    
    Student (Student  a)   // copy constrctor
    {
        
        this.name = a.name ;
        this.marks = a.marks;
        this.rollno = a.rollno;
    }

}
public class Main {
    
	public static void main(String[] args) {
	
        
    //**************************************Working With construcor*****************************************************//
    // Student obj = new Student(); -> calls implicit construcor 

    // we are making construcor with differnt different arguments
    //  is called constructor overloading 
    // all function return type is this
    Student obj = new Student(10, "Saurabh" , -1);  // we are making constructor for this which takes 3 parameter
    System.out.println(obj.marks + " " +obj.name + " " + obj.rollno );
    
    Student obj2 = new Student(20, "Yash" , -2);
    System.out.println(obj2.marks + " " +obj2.name + " " + obj2.rollno );

    // copy constructor
    Student temp = new Student(obj);
    System.out.println(temp.marks + " " +temp.name + " " + temp.rollno );
        
        
        
        
        

	}

}