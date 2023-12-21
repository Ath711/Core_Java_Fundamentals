/*
 * class Increment{
 *   int count;
 *   public void add(){
 *       count++;
 *    }
 *  }
 */

class Increment {

  int count;

  public synchronized void add() {
    count++;
  }
}

public class UnderstandingRaceCondition {

  public static void main(String args[]) {
    Increment increment = new Increment();

    Runnable obj1 = () -> {
      for (int i = 0; i < 10000; i++) increment.add();
    };

    Runnable obj2 = () -> {
      for (int i = 0; i < 10000; i++) increment.add();
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

    try {
      t1.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      t2.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    System.out.println(increment.count);
    /*
     * here if both threads reaches at same value of count
     * then count+1 is performed twice but on same value hence actually incremented only once
     * e.g. initilly t1 =  0 , count++ and count = 1
     * t2 fetches prev count = 1 , count++ and count = 2
     * now if race condition occurs then t1 = 2 and t2 = 2
     * so even after performing count++ two times by respective threads final count = 3
     * so increment should be done only by one thread at a time which is solved by keyword synchronized
     */
  }
}
