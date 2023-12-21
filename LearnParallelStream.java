import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class LearnParallelStream {

  public static void main(String args[]) {
    Random random = new Random();

    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 1_00_000_000; i++) {
      list.add(random.nextInt(100));
    }

    // int sum1 = list.stream().map(n -> n * 2).reduce(0, (c, e) -> c + e);
    // System.out.println(sum1);

    long startSequential = System.currentTimeMillis();
    int sum2 = list.stream().map(n -> n * 2).mapToInt(n -> n).sum();
    long endSequential = System.currentTimeMillis();

    long startSequentialParallel = System.currentTimeMillis();
    int sum3 = list.parallelStream().map(n -> n * 2).mapToInt(n -> n).sum();
    long endSequentialParallel = System.currentTimeMillis();

    System.out.println(sum2 + " : " + (endSequential - startSequential));
    System.out.println(sum3 + " : " + (endSequentialParallel - startSequentialParallel));
  
  }
}
