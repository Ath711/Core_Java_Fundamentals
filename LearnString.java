public class LearnString {

  public static void main(String ars[]) {
    // String string = new String("example");
    // System.out.println(string);

    StringBuffer stringBuffer = new StringBuffer("Hello");
    System.out.println(stringBuffer.capacity());
    System.out.println(stringBuffer);

    stringBuffer.append(" and Welcome");
    System.out.println(stringBuffer.capacity());
    System.out.println(stringBuffer);

    String str = stringBuffer.toString();
    System.out.println(str);

    stringBuffer.deleteCharAt(6);
    System.out.println(stringBuffer);
    //StringBuffer is thread safe and stringBuilder is not thread safe

  }
}
