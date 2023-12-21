abstract class Car {

  public abstract void drive();

  public abstract void service();

  public void show() {
    System.out.println("In Show");
  }
}

abstract class Music {

  public void playMusic() {
    System.out.println("Playing music ");
  }
  //abstract class can have both normal and abstract method
  //but its compulsory that abstract methods are in abstract class
}

class WagonR
  extends Car { // WagonR is the concrete class for which we can create the object

  public void drive() {
    System.out.println("driving ");
  }

  public void service() {
    System.out.println("Maintaining the Car");
  }
}

abstract class Honda extends Car {

  public void drive() {
    System.out.println("driving ");
  }
  //  The type Honda must implement the inherited abstract method Car.service()
  // so we can also declare Honda as Abstract class, but then we cannot create its object
}

public class Abstract {

  public static void main(String args[]) {
    // Car car = new Car();  wont work as we cannot create objects of abstract class;
    Car car = new WagonR();
    car.drive();
    car.show();
  }
}
