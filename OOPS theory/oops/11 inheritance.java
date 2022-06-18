import java.util.*;


// multiple inheritance is not possible in java
class car
{
    int gear ;
    int wheels;
    String carname;
}
class flyingcar extends car
{
    String cng ;
}

class flyinghydrocar extends flyingcar
{
    String name;
}


public class Main(){

    public static void main(String[] args) {
        // inheritance begins //////

        flyingcar obj = new flyingcar(); // compile time
        obj. gear =  5 ;
        obj.wheels = 4;
        obj.carname = "Dildo";
        obj.cng = "GAS";
        System.out.println(obj.gear + " " + obj.carname + " " +  obj.cng);


}



}