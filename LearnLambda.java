@FunctionalInterface
interface A {
  void show(int i);
}

@FunctionalInterface
interface B {
  int add(int a, int b);
}

public class LearnLambda {

  public static void main(String arg[]) {
    A obj = new A() {
      public void show(int i) {
        System.out.println(i);
      }
    };

    A obj1 = (int i) -> {
      System.out.println(i);
    };

    //we can skip the curly brackets for single statement
    A obj2 = (int i) -> System.out.println(i);

    A obj3 = i -> System.out.println(i);

    obj.show(10);
    obj1.show(15);
    obj2.show(20);
    obj3.show(25);

    B obj4 = new B() {
      public int add(int i, int j) {
        return i + j;
      }
    };

    int result = obj4.add(1, 2);
    System.out.println(result);

    // B obj5 = (int i, int j) -> {
    //         return i+j;
    //     };

    // B obj5 = (int i, int j) ->  i+j;

    B obj5 = (i, j) -> i + j;

    int result1 = obj5.add(1, 2);
    System.out.println(result1);
  }
}
