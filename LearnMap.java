import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LearnMap {

  public static void main(String args[]) {
    Map<String, Integer> map = new HashMap<>();
    map.put("ABC", 90);
    map.put("BCE", 98);
    map.put("ABC", 100); // this will overwrite previous A value
    map.put("CDE", 95);
    map.put("DEF", 93);
    map.put("EFG", 95);

    System.out.println(map);
    System.out.println(map.get("BCE"));

    System.out.println(map.keySet()); // keySet returns a set that is all keys, which here are of type String

    for (String key : map.keySet()) {
      System.out.println(key + " : " + map.get(key));
    }

    System.out.println(map.values()); // will return all values in contrast to keySet() which returns keys

    // we can also use HashTable (specifically for threads with synchronization) which is synchronized instead of HashMap
    System.out.println("Hashtable concept..");
    Map<String, Integer> map2 = new Hashtable<>();

    map2.put("ABC", 90);
    map2.put("BCE", 98);
    map2.put("ABC", 100); // this will overwrite previous A value
    map2.put("CDE", 95);
    map2.put("DEF", 93);
    map2.put("EFG", 95);

    System.out.println(map2);
  }
}
