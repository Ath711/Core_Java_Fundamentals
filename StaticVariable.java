class Mobile {

  String name;
  static String type;
  int price;

  public void showDetails() {
    System.out.println(name + " " + type + " " + price);
  }
}

public class StaticVariable {

  public static void main(String args[]) {
    Mobile mobile1 = new Mobile();
    Mobile mobile2 = new Mobile();

    Mobile.type = "Smartphone";

    mobile1.name = "Iphone 15";
    mobile1.price = 100000;

    mobile2.name = "Iphone 14";
    mobile2.price = 90000;

    mobile1.showDetails();
    mobile2.showDetails();
  }
}
