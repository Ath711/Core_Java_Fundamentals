class Human {

  private int age;
  private String name;

  //default constructor
  Human() {
    age = 0;
    name = " ";
  }

  //parameterized constructor
  Human(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
}

public class ParameterizedConstructor {

  public static void main(String args[]) {
    Human human = new Human(10, "ABC");
    // human.age = 18;
    // human.name = "ABC";

    System.out.println(human.getName() + " " + human.getAge());
  }
}
