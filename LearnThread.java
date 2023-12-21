class A extends Thread {

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("hello");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}

class B extends Thread {

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("welcome");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}

public class LearnThread {

  public static void main(String args[]) {
    A obj1 = new A();
    B obj2 = new B();

    obj2.setPriority(Thread.MAX_PRIORITY);

    obj1.start();
    try {
      Thread.sleep(15);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    obj2.start();
  }
}
