class Laptop { //extends Object    every class predefined extends to Obect class

  int price;
  String model;

  // if we dont write our own implementation then comparing two objects with same value will reutrn false, this is because pre defined implementation of equals method compare objects using there hash value
  public boolean equals(Laptop obj) {
    return (this.model == obj.model && this.price == obj.price);
  }

  // if we directly print an object like sout(obj) it will return className@hashvalue as there is toString predefined for each object and that toString has the said implementation. we can make our own implementation of toString that will override the default method to print the instance variables
  public String toString() {
    return (model + " : " + price);
  }
}

public class ObjectHashCode {

  public static void main(String args[]) {
    Laptop laptop = new Laptop();
    laptop.model = "Yoga";
    laptop.price = 1000;

    Laptop laptop2 = new Laptop();
    laptop2.model = "Yoga";
    laptop2.price = 1000;
    boolean result = laptop.equals(laptop2);
    System.out.println(result);

    System.out.println(laptop);
    System.out.println(laptop2);
  }
}
