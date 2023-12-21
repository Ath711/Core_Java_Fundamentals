// Running, Failed and so on are called name constant
// we cannot extend enum class with any other class
// though we can define constructor or variables or methods
// enum by default extends to Enum class java.lang.Enum

enum Status {
  Running,
  Failed,
  Pending,
  Success,
}

enum Laptop {
  Macbook(2000),
  XPS(),
  Surface(1500),
  ThinkPad(1800);

  private int price;

  private Laptop() {
    price = 1000;
  }

  private Laptop(int price) {
    this.price = price;
    System.out.println("in lapotp " + this.name());
    System.out.println();
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}

public class LearnEnum {

  public static void main(String args[]) {
    Status s = Status.Running;
    System.out.println(s);
    System.out.println();

    // all constants have index

    System.out.println(s.ordinal());
    System.out.println();

    // we can also get all constants as Status is class

    Status statArray[] = Status.values();
    for (Status status : statArray) {
      System.out.println(status + ":" + status.ordinal());
    }
    System.out.println();

    //using if loop with enum

    Status status = Status.Pending;

    if (status == Status.Success) System.out.println("All good"); else if (
      status == Status.Failed
    ) System.out.println("Try again"); else if (
      status == Status.Pending
    ) System.out.println("Wait"); else System.out.println("running");
    System.out.println();

    //we can also use the switch statement
    switch (status) {
      case Running:
        System.out.println("running");
        break;
      case Pending:
        System.out.println("Wait");
        break;
      default:
        break;
    }
    System.out.println();

    //Laptop example

    Laptop lap = Laptop.Macbook;
    System.out.println(lap.getPrice());
    System.out.println();

    for (Laptop laptop : Laptop.values()) {
      System.out.println(laptop + ":" + laptop.getPrice());
    }
  }
}
