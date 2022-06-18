// this is a self refrencial pointer
import java.util.*;


class Student{   // making blueprint what was we taking in class - > overview
	int marks;
	String name ;
	int rollno;

    Student(int marks , String name , int rollno)   // parametrize constrcutor
    {
        this.marks = marks ;
        this.name =  name ;
        this.rollno = rollno ;
    }

}
public class Main {
    
	public static void main(String[] args) {

    Student obj = new Student(10, "Saurabh" , -1); 
    System.out.println(obj.marks + " " +obj.name + " " + obj.rollno );
    
        
        
        
        
        

	}

}