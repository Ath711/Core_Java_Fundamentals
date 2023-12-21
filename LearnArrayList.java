import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LearnArrayList {

  public static void main(String args[]) {
     
    /*
    Collection nums = new ArrayList();
    
    // if we dont define <Integer> then below will be considered as objects
    nums.add(1);
    nums.add(2);
    nums.add(3);

    System.out.println(nums); // we can directly print entire collection

    // for collection we dont have indexing
    // but we can use enhanced for loop

    for (Object c : nums) {
      System.out.println( (Integer) c * 2);
    }
    */
    

    Collection<Integer> nums = new ArrayList<Integer>();
    nums.add(1);
    nums.add(2);
    nums.add(3);

    System.out.println(nums);

    for (int c : nums) {
      System.out.println(c*2);
    }

    // if we just want to add and fetch value then collection is ok
    // for index we can use List instead of keyword Collection
    System.out.println("List Concept.. ");
    List<Integer> nums1 = new ArrayList<Integer>();
    nums1.add(1);
    nums1.add(2);
    nums1.add(3);
    nums1.add(5);
    System.out.println(nums1.get(1));
    System.out.println(nums1.indexOf(5));

  }
}
