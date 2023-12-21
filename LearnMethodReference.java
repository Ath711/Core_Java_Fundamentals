import java.util.Arrays;
import java.util.List;

public class LearnMethodReference {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("abc", "cde", "efg", "ghi");

    List<String> allCapital = names
      .stream()
      .map(name -> name.toUpperCase())
      .toList();

    System.out.println(allCapital);

    // using method reference
    // method reference means that you can pass a method name inisde a method which specifies that this method is responsible for completion of the task
    // we have to specify class name or object name

    List<String> allCapital1 = names
    .stream()
    .map(String::toUpperCase)
    .toList();

    allCapital1.forEach(System.out::println);
  }
}
