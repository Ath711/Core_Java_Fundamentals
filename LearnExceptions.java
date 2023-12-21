import java.util.Scanner;

public class LearnExceptions {

  public static void main(String a[]) {
    int i = 20;
    int j = 0;

    int[] nums = new int[5];

    String string = null;

    /*
        if we dont write critical statements that may cause runtime errors in try block then on occurrence of such runtime error, program will stop at that line.
        try and catch will prevent from program to stop by hanling the exception
        try block throws a object of exception which is accepted as parameter to catch block */

    try {
      // j = 18;

      j = 18 / i; //causes arithmetic exception / 0 if i = 0, and if exception occurs further below statments will be skipped.

      /* 
            now lets say we are diving 18/20 then output will be 0 and catch block wont be exceuted but we still want to call catch in this case
            we can call catch block usig throw keyword
            */
      if (j == 0) throw new ArithmeticException("j is zero");

      System.out.println(nums[4]);

      System.out.println(string.length());
    } // catch(ArithmeticException e){
    //     System.out.println("Arithmetic exception occured ");
    // }

    catch (ArithmeticException e) {
      j = 18 / 1;
      System.out.println(
        "cannot divide by zero, using divide by 1 as default value " + e
      );
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Index is beyond the set limit");
    } catch (Exception e) {
      System.out.println("Something went wrong " + e);
    } finally {
      // we can use finally block which is executed in both cases (exception occurs or it doesn't)
      System.out.println("in finally");
      System.out.println(j);
    }

    System.out.println("program ends here");
  }
}
