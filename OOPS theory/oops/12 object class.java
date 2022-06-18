import java.util.*;

// by default car class is inherited by object class and this is the reason of dimond of death problem


// multiple inheritance is not possible in java
// class car extends object{   // by default car class is inherited by object class
//     int gear ;
//     int wheels;
//     String carname;
// }

// isa has
class music{
    string song ;
}

class car{   
    int gear ;
    int wheels;
    String carname;
    music obj ; // car HSA music -> has a relationship

}




public class Main(){

    public static void main(String[] args) {
        // inheritance begins //////

        flyingcar obj = new flyingcar();
        obj. gear =  5 ;
        obj.wheels = 4;
        obj.carname = "Dildo";
        obj.cng = "GAS";
        System.out.println(obj.gear + " " + obj.carname + " " +  obj.cng);


}



}