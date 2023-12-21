import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LearnStreamApi {

  public static void main(String args[]) {
    /*
     * We will create a list of integers
     * Mulitply all even numbers by 2
     * And return there addition
     */

    List<Integer> nums = Arrays.asList(4, 2, 1, 5, 7, 6);

    // solving the problem without stream api
    int sum = 0;
    for (int n : nums) {
      if (n % 2 == 0) {
        n = n * 2;
        sum = sum + n;
      }
    }

    System.out.println(sum);

    System.out.println("using stream api..");

    // Stream is an interface
    // once stream is used we cannot reuse it

    /*
     * Stream<Integer> s1 = nums.stream();
     * Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
     * Stream<Integer> s3 = s2.map(n -> n * 2);
     * int result = s3.reduce(0,(c,e) -> c+e);
     */

    int result = nums
      .stream()
      .filter(n -> n % 2 == 0)
      .map(n -> n * 2)
      .reduce(0, (c, e) -> c + e);

    System.out.println("addition of even numbers multiplied by 2 : " + result);
  }
}
