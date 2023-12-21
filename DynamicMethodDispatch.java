class Computer {

  public void show() {
    System.out.println("in Computer");
  }
}

class Laptop extends Computer {

  public void show() {
    System.out.println("in Laptop");
  }
}

class Mobile extends Computer {

  public void show() {
    System.out.println("in Mobile");
  }
}

public class DynamicMethodDispatch {

  public static void main(String args[]) {
    Computer computer = new Computer();
    computer.show();

    computer = new Laptop(); // refrence of super class and the object of the sub class
    computer.show();

    computer = new Mobile();
    computer.show();
    //irrespective of the type of reference variable, it depends on whose object you create
    //only works for inheritance.. child objects for parent variable

  }
}
