class Students {

  int marks;
  int roll;

  Students(int marks, int roll) {
    this.marks = marks;
    this.roll = roll;
  }
}

public class ArrayObj {

  public static void main(String a[]) {
    Students s1 = new Students(100, 1);
    Students s2 = new Students(98, 2);

    Students[] stud = new Students[2];
    stud[0] = s1;
    stud[1] = s2;

    for (int i = 0; i < stud.length; i++) {
      System.out.println(stud[i].roll + " : " + stud[i].marks);
    }
    System.out.println("==============");
    for (Students s : stud) {
      System.out.println(s.roll + " : " + s.marks);
    }
  }
}
