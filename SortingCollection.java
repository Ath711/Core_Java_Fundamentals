import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

  public static void main(String args[]) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(5);
    list.add(6);
    list.add(1);
    System.out.println(list);

    Collections.sort(list);

    System.out.println("Using Collections.sort() : " + list);

    // if we want to sort based on last digit using our logic
    List<Integer> list1 = new ArrayList<>();
    list1.add(10);
    list1.add(52);
    list1.add(61);
    list1.add(13);
    System.out.println(list1);

    Collections.sort(list1);

    System.out.println("Using Collections.sort() : " + list1);
  }
}
