import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

  public static void main(String args[]) {
    Set<Integer> nums = new HashSet<Integer>();
    nums.add(21);
    nums.add(31);
    nums.add(53);
    nums.add(23);
    nums.add(53); // Set have only unique values
    // set does not have index
    for (int n : nums) System.out.println(n);

    // for sorted values we can use TreeSet

    System.out.println("Tree set concept.. ");
    Collection<Integer> nums1 = new TreeSet<Integer>();
    nums1.add(21);
    nums1.add(31);
    nums1.add(53);
    nums1.add(23);
    nums1.add(53);
    for (int n : nums1) System.out.println(n);

    // collection extends Iterable which has iterator method
    // we can use iterator instead of for loop

    System.out.println("Using iterator..");
    Iterator<Integer> value = nums1.iterator();
    while (value.hasNext()) System.out.println(value.next());
  }
}
