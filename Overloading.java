import java.util.Scanner;

class Calculator {

  public int add(int num1, int num2) {
    return (num1 + num2);
  }

  public double add(double num1, double num2) {
    return (num1 + num2);
  }
}

public class Overloading {

  public static void main(String args[]) {
    Calculator calculator = new Calculator();
    System.out.println(
      "do you want to perform additon of 1. Integer r 2. Double"
    );
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        int ans = calculator.add(10, 11);
        System.out.println(ans);
        sc.close();
        break;
      case 2:
        double ansDouble = calculator.add(10, 11);
        System.out.println(ansDouble);
        sc.close();
        break;
      default:
        System.out.println("Invlaid option");
        break;
    }
  }
}
