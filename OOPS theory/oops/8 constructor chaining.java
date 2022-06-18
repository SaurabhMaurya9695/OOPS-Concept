import java.util.*;

class cuboid
{
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

public class Main {
    
	public static void main(String[] args) {

        
        // cuboid class access
        cuboid obj = new cuboid();
        cuboid obj2 = new cuboid(10);
        cuboid obj3 = new cuboid(10 , 20);
        cuboid obj4 = new cuboid(10 , 20 , 30 );
        // System.out.println(obj3.area());
        // System.out.println(obj3.volume());
        cuboid ans = (obj4.join(obj3));
        System.out.println(ans.length + " " + ans.breath + " " + ans.height);
        
   

	}

}