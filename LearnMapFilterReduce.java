import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LearnMapFilterReduce {

  public static void main(String args[]) {
    /*
     * We will create a list of integers
     * Mulitply all even numbers by 2
     * And return there addition
     */

    List<Integer> nums = Arrays.asList(4, 2, 1, 5, 7, 6);

    // filter needs an object of Predicate, Predicate is a functional interface with a method test(T t)
    Predicate<Integer> predicate = n -> n % 2 == 0;

    // map needs an object of Function, Function is a functional interface with a method apply(T t)
    Function<Integer, Integer> function = n -> n * 2;
    
    // reduce needs an object of BinaryOperator which extends BiFunction, BiFunction is a functional interface with a method apply(T t, U u)
    BinaryOperator<Integer> binaryOperator = (c, e) -> c + e;

    int result = nums
      .stream()
      .filter(predicate)
      .map(function)
      .reduce(0, binaryOperator);

    System.out.println(result);
  }
}
