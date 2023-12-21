import java.util.Scanner;

public class Stack {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of stack ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = -1;
    }

    char y;

    do {
      System.out.println("1. Push, 2. Pop");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("enter element to push");
          int pushElement = sc.nextInt();
          push(pushElement, arr);
          System.out.println("------------------------------");
          printStack(arr);
          break;
        case 2:
          pop(arr);
          System.out.println("------------------------------");
          printStack(arr);
          break;
        default:
          break;
      }

      System.out.println("Do you want to continue");
      y = sc.next().charAt(0);
    } while (y == 'y');
    sc.close();
  }

  private static int[] pop(int arr[]) {
    int temp = 0;
    for (int i = arr.length - 1; i > -1; i--) {
      if (arr[i] != -1 && i >= 0) {
        temp = arr[i];
        arr[i] = -1;
        break;
      }
    }

    if (temp > 0) System.out.println(
      temp + " removed from the stack"
    ); else System.out.println("no elements in stack");

    return arr;
  }

  private static void printStack(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.println(arr[i]);
    }
  }

  private static int[] push(int element, int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        arr[i] = element;
        break;
      } else if (i == arr.length - 1 && arr[i] != -1) {
        System.out.println("No memory");
      }
    }
    return arr;
  }
}
