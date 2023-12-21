class MyException extends Exception {

  public MyException(String str) {
    super(str);
  }
}

public class LearnCustomException {

  public static void main(String args[]) {
    int i = 20;
    int j = 0;

    try {
      j = 18 / i;
      if (j == 0) throw new MyException("j is zero");
    } catch (MyException e) {
      j = 18 / 1;
      System.out.println(
        "cannot divide by zero, using divide by 1 as default value " + e
      );
    }
  }
}
