import java.util.*;

// by default car class is inherited by object class and this is the reason of dimond of death problem


// multiple inheritance is not possible in java
// class car extends object{   // by default car class is inherited by object class
//     int gear ;
//     int wheels;
//     String carname;
// }
class car{   
    int gear ;  // ISA relationship
    int wheels;
    String carname;
    music obj ; // car HSA music -> has a relationship
    car()
    {
        System.out.println("car execution");
    }
    
    car(int gear)
    {
       this.gear = gear ;
    }
    
    car(int gear , String s)
    {
        if(s == "Nados")
        {
            this.gear = gear ;
            this.carname = carname ;
        }
        else{
            System.out.println("9 to 12");
        }
    }

}


class flyingcar extends car{
    String cng ;
    flyingcar()
    {
        //super() ; // calls cars contructor .. . . . . = > calls a constructor with no parameter
        //super(5);  // calls cars contructor .. . . . . = > calls a constructor with single parameter
        // super(10 , "dsa") ;    
        System.out.println("flyingcar execution");
    }
    
    flyingcar(String wings)
    {
        System.out.println("flyingcar execution");
    }
}




public class Main(){

    public static void main(String[] args) {
        // inheritance begins //////

        fflyingcar obj = new flyingcar();
        obj. gear =  5 ;
        obj.wheels = 4;
        obj.carname = "Dildo";
        // obj.cng = "GAS";
        // System.out.println(obj.gear + " " + obj.carname + " " +  obj.cng);
        // System.out.println(obj.gear + " " + obj.carname );


}



}