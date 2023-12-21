import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LearnBufferedReader {

  public static void main(String args[]) {
    System.out.println("Enter 1st number ");
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    int number = 0;
    try {
      number = Integer.parseInt(bufferedReader.readLine());
    } catch (NumberFormatException | IOException e) {
      e.printStackTrace();
    }

    System.out.println(number);

    try {
      bufferedReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    /*
     * System.out.println("Enter 2nd number ");
     * int num = 0;
     * try {
     *    num = System.in.read(); //this will return ascii code
     * } catch (IOException e) {
     *    e.printStackTrace();
     * }
     * System.out.println(num);
     */

  }
}
