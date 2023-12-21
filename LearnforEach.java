import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LearnforEach {

  public static void main(String args[]) {
    List<Integer> nums = Arrays.asList(4, 2, 1, 5, 7, 6);

    // using forEach() method to access the List elements

    nums.forEach(n -> System.out.println(n));

    // forEach() takes object of Consumer which is a functional Interface

    System.out.println("--------------------");
    Consumer<Integer> consumer = new Consumer<Integer>() {
      public void accept(Integer n) {
        System.out.println(n);
      }
    };

    /*
     * Consumer<Integer> consumer = n -> {
     *   System.out.println(n);
     * };
     */

    /*
     * Consumer<Integer> consumer  = n -> System.out.println(n);
     */

    nums.forEach(consumer);
  }
}
