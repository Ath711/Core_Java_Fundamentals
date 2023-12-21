class Mobile {

  String name;
  static String type;
  int price;

  Mobile() {
    name = "NA";
    price = 100;
    System.out.println("In constructor ");
  }

  static {
    type = "Smartphone";
    System.out.println("In static ");
  }

  public void showDetails() {
    System.out.println(name + " " + type + " " + price);
  }
}

public class StaticBlock {

  public static void main(String args[]) {
    // Mobile mobile1 = new Mobile();

    // Mobile mobile2 = new Mobile();

    // mobile1.name = "Iphone 15";
    // mobile1.price = 100000;

    // mobile1.showDetails();
    // mobile2.showDetails();

    //loads the class
    try {
      Class.forName("Mobile");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
