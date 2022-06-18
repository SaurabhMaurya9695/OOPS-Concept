import java.util.*;
// static property is access by all of the class memeber


class cuboid
{
    int length;
    int breath;
    int height ;
static String university = "SRMCEM" ; // access by all of the Student members
    // explict constructor

   cuboid(){
       length =1 ;
       breath= 1 ;
       height = 1 ;
   }
    // *******************************Access Modifier example************************************ //
    public int getlength()
    {
        return this.length;
    }
    public void setlength(int x , String name)
    {
        if(name == "saurabh")
            this.length = length ;
    }
    
   
}

public class Main {
    
	public static void main(String[] args) {

    
        cuboid obj = new cuboid();
        // cuboid.length() += 5 ;
        cuboid.setlength(20 , "saurabh");
    

	}

}
        
   





