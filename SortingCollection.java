import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {

  int age;
  String name;

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public int compareTo(Student that) {
    if (this.age > that.age) return 1; else return -1;
  }
}

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

    // ----------------------------------------------------------------------

    // if we want to sort based on last digit using our logic
    Comparator<Integer> comparator = new Comparator<Integer>() {
      public int compare(Integer i, Integer j) {
        if (i % 10 > j % 10) return 1; else return -1;
      }
    };

    List<Integer> list1 = new ArrayList<>();
    list1.add(10);
    list1.add(52);
    list1.add(61);
    list1.add(13);
    System.out.println(list1);

    Collections.sort(list1, comparator);

    System.out.println("Using Collections.sort(lsit1,comparator) : " + list1);

    // ----------------------------------------------------------------------

    // lets sort a string based on its length
    List<String> strList = new ArrayList<>();
    strList.add("c");
    strList.add("abc");
    strList.add("ac");
    strList.add("a");

    // we can also use lambda expression as Comparator is Functional Interface
    Comparator<String> strComparator = (i, j) -> {
      return i.length() > j.length() ? 1 : -1;
    };

    System.out.println(strList);

    Collections.sort(strList, strComparator);

    System.out.println(
      "Using Collections.sort(strList,comparator) : " + strList
    );
    // ----------------------------------------------------------------------

    // lets sort a Student class
    List<Student> studs = new ArrayList<>();
    studs.add(new Student(10, "ABC"));
    studs.add(new Student(11, "CDE"));
    studs.add(new Student(12, "EFG"));
    studs.add(new Student(10, "GHI"));

    for (Student s : studs) System.out.println(s);

    Comparator<Student> studComparator = new Comparator<Student>() {
      public int compare(Student i, Student j) {
        if (i.age > j.age) return 1; else return -1;
      }
    };

    Collections.sort(studs, studComparator);
    System.out.println("-------------------");
    for (Student s : studs) System.out.println(s);

    // or we can also implement Comparable
    System.out.println("-------------------");
    Collections.sort(studs);
    for (Student s : studs) System.out.println(s);
  }
}
