
import java.util.*;


class Student{   // making blueprint what was we taking in class - > overview
	private int marks;
	String name ;
	int rollno;
	static String university = "SRMCEM" ; // access by all of the Student members
	
	// implicit const with default paraemeter value zero for int and null for string 
	// Student(){
	    
	    
	// }
	
// 	explicit constructor ----- return type "this" which was hidden 
	// Student()    // same as class name and with no return type is called constructor ...
    // {
    //     marks = 100 ;
    //     name = "saurabh's constructor";
    //     rollno  = -1 ;
    //     System.out.println("hey the consturctor of student class is created");
    // }

    // *******************************Access Modifier example************************************ //
    // public int getmarks()
    // {
    //     return this.marks;
    // }
    // public void setmarks()
    // {
    //     this.marks = marks ;
    // }

// 	public void study(String subject)   // Function's Method //
// 	{
// 		System.out.println("we are studying ->" + subject);
// 	}

    // Student(int newmarks , String newname , int newrollno)   // parametrize constrcutor
    // {
    //     marks = newmarks ;
    //     name =  newname ;
    //     rollno = newrollno ;
    // }
    
    // Student (Student  a)   // copy constrctor
    // {
        
    //     this.name = a.name ;
    //     this.marks = a.marks;
    //     this.rollno = a.rollno;
    // }
    
    /////////////////////////////////////////////////////////////////////////////////////
    // use of this
    // Student(int marks , String name , int rollno)   // parametrize constrcutor
    // {
    //     this.marks = marks ;
    //     this.name =  name ;
    //     this.rollno = rollno ;
    // }
    // public void study(String subject)   // Function's Method //
    // {
    //   System.out.println("we are studying ->" + subject);
    // }

    //  public static void exam()  // static keyword can't be acces this self refrencial model 
    // {
    //   System.out.println(this.name+ " is givindg exams ");
    // }
    

    // static void study()
    // {
    //   System.out.println("student studys in " + university + "university");
    // }

}

// By contrcutor chaining we reduce the redundency ;
class cuboid{
    int length;
    int breath;
    int height ;
    // explict constructor
    public cuboid(){ 
        // length = breath = height =  1; we can write this by default
        this(1); // this will call a const with a single parameter 
    }
    
    
    
    public cuboid(int side){  // call by this(1);
        // this.length = side;
        // this.breath  side;
        // this.height = side;
        this(side, side ,side);
        
    }
    
    public cuboid(int length , int breath ){
        this(length , breath , 1);
        
    }
    public cuboid(int length , int breath , int height){
        System.out.println(length + breath + height);
        this.length = length;
        this.breath = breath;
        this.height = height;
        
    }
    public int  volume()
    {
        return (this.area() * this.height) ;
    }
    public int area(){
        return (this.length * this.breath ) ;
    }
    
    public cuboid join(cuboid other)
    {
        this.length += other.length;
        this.breath +=  other.breath ;
        this.height += other.height;
        return this;
    }
    
   
}

// by default car class is inherited by object class
class music{
    string song ;
}

class car{   
    int gear ;  // ISA relationship
    int wheels;
    String carname;
    music obj ; // car HSA music -> has a relationship

}


// class flyingcar extends car{
//     String cng ;
// }

// class flyinghydrocar extends flyingcar{
//     String name;
// }
public class Main {
    
    // public static void swap4(Student a, Student b)
    // {
    //     Student temp = new Student();
    //     temp.marks = a.marks;
    //     temp.rollno = a.rollno;
        
    //     a.marks = b.marks;
    //     a.rollno = b.rollno;
        
    //     b.marks = temp.marks;
    //     b.rollno = temp.rollno;
    // }
    
    //  public static void swap3(Student a, Student b)
    //  {
    //     Student temp = a;
    //     a.marks = b.marks;
    //     a.rollno = b.rollno;
    //     b.marks = temp.marks;
    //     b.rollno = temp.rollno;
    // }
    
    //  public static void swap2(Student a, Student b){
    //     Student temp = new Student();
    //     temp.marks = a.marks ;
    //     temp.rollno = a.rollno ;
    //     a = b;
    //     b = temp;
    // }
    
    
    // public static void swap1(Student a, Student b){
    //     Student temp = a;
    //     a = b;
    //     b = temp;
    // }
    
	public static void main(String[] args) {
            // inheritance begins //////

        flyingcar obj = new flyingcar();
        obj. gear =  5 ;
        obj.wheels = 4;
        obj.carname = "Dildo";
        // obj.cng = "GAS";
        // System.out.println(obj.gear + " " + obj.carname + " " +  obj.cng);
        System.out.println(obj.gear + " " + obj.carname );





    }
		
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
	    
	   // as soon as the object is created ... constructor has been called-
		Student obj = new Student();
		// System.out.println(obj.marks + " " +obj.name + " " + obj.rollno );

        

        // ******************************************************************************
        // obj.marks += 5; // private access if we write private int marks ;
        // obj.setmarks(20);
        // ******************************************************************************



		// obj.marks = 10;
		// obj.name ="saurabh";
		// obj.rollno = 1812213095;
		// obj.study("dsa");
		// System.out.println(obj.marks + " " +obj.name + " " );


		// // making second obj ;
// 		Student obj2 = new Student();
// 		obj2.marks = 20 ;
// 		obj2.name = "Yash";
// 		obj2.rollno = 1812213108;
// 		obj2.study("Mathematics");
// 		System.out.println( obj2.marks + " " + obj2.name);

        // before calling swap function
        // System.out.println(" before calling") ;
        // System.out.println(obj.marks + " " +obj.rollno );
        // System.out.println(obj2.marks + " " +obj2.rollno  );
        
     // changes inside heap is called deep copy or changes inside stack is called shallow copy
//   swap function calling 
        // swap1(obj, obj2);
        // swap2(obj , obj2);
        // swap3(obj , obj2);  50per swapping done   
        // swap4(obj , obj2); // fully swapping 
        // System.out.println(" after calling") ;
        // System.out.println(obj.marks + " " +obj.rollno );
        // System.out.println(obj2.marks + " " +obj2.rollno  );
        
        //**************************************Working With construcor*****************************************************//
        
        // we are making construcor with differnt different arguments is called constructor overloading
        
        // Student obj = new Student(10, "Saurabh" , -1);  // we are making constructor for this which takes 3 parameter
        // obj.study("DSA");
        // System.out.println(obj.marks + " " +obj.name + " " + obj.rollno );
        
        // Student obj2 = new Student(20, "Yash" , -2);
        // System.out.println(obj2.marks + " " +obj2.name + " " + obj2.rollno );
        
        // // copy constructor
        // Student temp = new Student(obj);
        // System.out.println(temp.marks + " " +temp.name + " " + temp.rollno );
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // cuboid class access
        // cuboid obj = new cuboid();
        // cuboid obj2 = new cuboid(10);
        // cuboid obj3 = new cuboid(10 , 20);
        // cuboid obj4 = new cuboid(10 , 20 , 30 );
        // // System.out.println(obj3.area());
        // // System.out.println(obj3.volume());
        // cuboid ans = (obj4.join(obj3));
        // System.out.println(ans.length + " " + ans.breath + " " + ans.height);
        
        ////////////////////////////////// working with static keyword/////////////////////////////////////////
        
        
        
        // Student obj = new Student(10, "Saurabh" , -1);
        // obj.study("dsa");
        // System.out.println(obj.marks + " " +obj.name + " " + obj.university );
        // obj.study() ;

        // why we use static keyword in main function -> because without any creation of object we run our program on ide
        
        
   

	// }

}