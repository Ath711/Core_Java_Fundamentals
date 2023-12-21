import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Student {

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student(String name) {
    this.name = name;
  }

  public Student() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }
}

public class LearnConstructorReference {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("abc", "cde", "efg", "ghi");
    List<Integer> age = Arrays.asList(10, 13, 10, 12);

    // for(String name : names){
    //     students.add(new Student(name));
    // }

    // List<Student> students = names
    //   .stream()
    //   .map(s -> new Student(s)) 
    //   .collect(Collectors.toList());

    List<Student> students = names
      .stream()
      .map(Student::new) //constructor reference
      .collect(Collectors.toList());


    IntStream
      .range(0, Math.min(students.size(), age.size()))
      .forEach(i -> students.get(i).setAge(age.get(i)));

    System.out.println(students);
  }
}
