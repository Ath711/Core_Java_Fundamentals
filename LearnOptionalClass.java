import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// import java.util.stream.Collectors;

public class LearnOptionalClass {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("abc", "cde", "efg", "ghi");

    // Optional class is used to solve the null pointer exception
    Optional<String> name = names
      .stream()
      .filter(n -> n.contains("h"))
      .findFirst();
    System.out.println(name.orElse("Not found"));
    // we can use .collect(Collectors.toList()); instead of findFirst() to get all occurence
    // Collectors requires List<String> instead of Optional<String>
  }
}
