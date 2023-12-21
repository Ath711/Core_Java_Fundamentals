//final can be used with variable or a method or a class

// final variable = cannot be changed later
public class Final {

  public static void main(String args[]) {
    final int num = 8;

    //num =10; this can not work as num is final that means cannot be changed
    System.out.println(num);
  }
}

//final class = cannot be inherited
final class AA {

  public void show() {
    System.out.println("in show of AA");
  }
}

// this below inheritance wont work as AA is set for final
// class BB extends AA{
// public void show(){
//     System.out.println("in show of BB");
// }
// }

//final method = cannot be overriden
class AB {

  public final void show() {
    System.out.println("in show of AB");
  }
}

// to stop method overriding we can declare method to be final
class BA extends AB {
  // public void show(){
  //     System.out.println("in show of BA");
  // }
}
