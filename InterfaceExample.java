interface Computer {
  // all methods inside interface are public abstract by default
  void code();
}

class Laptop implements Computer {

  public void code() {
    System.out.println("Coding using Laptop");
  }
}

class Dekstop implements Computer {

  public void code() {
    System.out.println("Coding using Desktop");
  }
}

class Developer {

  public void devApps(Computer computer) {
    computer.code();
  }
}

public class InterfaceExample {

  public static void main(String args[]) {
    Laptop laptop = new Laptop();
    Dekstop dekstop = new Dekstop();

    Developer developer = new Developer();
    developer.devApps(laptop);
    developer.devApps(dekstop);
  }
}
