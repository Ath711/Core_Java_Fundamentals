class Human {

  private int age;
  private String name;

  Human() {
    age = 0;
    name = " ";
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

public class Constructor {

  public static void main(String args[]) {
    Human human = new Human();
    // human.age = 18;
    // human.name = "ABC";
    human.setAge(10);
    human.setName("ABC");
    System.out.println(human.getName() + " " + human.getAge());
  }
}
