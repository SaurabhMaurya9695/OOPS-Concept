// Another way to achieve abstraction in Java, is with interfaces.

// An interface is a completely "abstract class" that is used to
//  group related methods with empty bodies:

// interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void run(); // interface method (does not have a body)
}
// interface class doesn't have a body;
// we can't inherit the interface class we just implement this...



// Interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
  }
  
  // Pig "implements" the Animal interface
  class Pig implements Animal {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
      // The body of sleep() is provided here
      System.out.println("Zzz");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      Pig myPig = new Pig();  // Create a Pig object
      myPig.animalSound();
      myPig.sleep();
    }
  }


// Java does not support "multiple inheritance" (a class can only inherit from one superclass).
// However, it can be achieved with interfaces, because the class can implement multiple
// interfaces. Note: To implement multiple interfaces, separate them with a comma 

