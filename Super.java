class A extends Object {

  public A() {
    System.out.println("in A");
  }

  public A(int n) {
    System.out.println(" int of constructor A");
  }
}

//every class in Java extendes to Object class, even if we dont mention it

class B extends A {

  public B() {
    // super(); <---- this method is there by default even if we dont write it, and every constructor (default, parametrized) first statement is super();
    // super(1);
    System.out.println("in B");
  }

  public B(int n) {
    // super(); <---- this method is there by default even if we dont write it, and every constructor (default, parametrized) first statement is super();
    //super(n); explicitly added parameter to supper here

    //this(); <---  this(); will call constructor of same class
    //here it will call class B default constructor then default constructor has super keyword predefined which will call class A default constructor
    this();
    System.out.println(" int of constructor B");
  }
}

public class Super {

  public static void main(String args[]) {
    // B b = new B();
    B b1 = new B(1);
  }
}
