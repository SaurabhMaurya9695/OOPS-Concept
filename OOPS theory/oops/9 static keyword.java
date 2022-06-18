import java.util.*;
//static property is access by all of the class memeber


class cuboid
{
    int length;
    int breath;
    int height ;
    static String university = "SRMCEM" ; // access by all of the Student members
    // explict constructor
 
}

public class Main {
    
	public static void main(String[] args) {

    
    cuboid obj = new cuboid(10, "Saurabh" , -1);
    obj.study("dsa");
    System.out.println(obj.marks + " " +obj.name + " " + obj.university );
    obj.study() ;

    //  why we use static keyword in main function ->
    //  because without any creation of object we run our program on ide

	}

}
        
   





