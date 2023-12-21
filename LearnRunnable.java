// If we extend to a Thread clss we cannot extend any other class as multiple inhertiance is not allowed
// To solve this we can implement Runnable (Thread class implements Runnable)

/* 
 class A implements Runnable {
    public void run(){
        for(int i=0; i<10; i++){
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
*/

/* 
class B implements Runnable {

  public void run() {
    for (int i = 0; i < 10; i++) {
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
*/
public class LearnRunnable {

  public static void main(String args[]) {
    /* 
    Runnable obj1 = new Runnable() {
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println("hello");
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }
    };
    */

    Runnable obj1 = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("hello");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    };

    Runnable obj2 = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("welcome");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t2.setPriority(Thread.MAX_PRIORITY);

    t1.start();
    t2.start();
  }
}
