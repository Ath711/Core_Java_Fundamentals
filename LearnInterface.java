interface Learn {
  //all the methods in the interface are by default public abstract
  //similar to abstract class we cananot create object of a interface
  // though we can create reference like LearnInterface learninterface;

  void show();
  void config();

  // int age; the variable are by default final and static, so need to be initialized
  int age = 20; //we can directly use the interface name since its static
}

abstract class AB implements Learn {

  // here we have to implement both the methods of interface
  // The type AB must implement the inherited abstract method LearnInterface.config()
  // otherwise this class AB will become abstract
  public void show() {}
}

//to create concrete class we have to define both methods

class AA implements Learn {

  public void show() {
    System.out.println("in show");
  }

  public void config() {
    System.out.println("in config");
  }
}

public class LearnInterface {

  public static void main(String args[]) {
    AA object = new AA();
    object.config();
    object.show();

    // Learn.age = 18; <---wont work as its final
    System.out.println(Learn.age);
  }
}
