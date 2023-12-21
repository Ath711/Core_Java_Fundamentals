import utility.addNumber;

public class Array {

  public static void main(String args[]) {
    int[][] arr = new int[4][4];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        arr[i][j] = (int) (Math.random() * 10);
      }
    }

    for (int[] i : arr) {
      for (int j : i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
