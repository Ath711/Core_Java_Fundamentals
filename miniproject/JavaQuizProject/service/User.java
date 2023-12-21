package JavaQuizProject.service;


import java.util.Scanner;

public class User {
    private int points;
    private Admin admin;

    public User(int points, Admin admin) {
        this.points = points;
        this.admin = admin;
    }

    public int playGame(){

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++){

            System.out.println(i+1 + "." + admin.getQuestions(i) + " ");
            System.out.println(admin.getAnswers(i) + "\n" + admin.getOptions(i));
            System.out.println("Enter you answer in any case and then press enter");

            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase(admin.getAnswers(i))) points++;
            else System.out.println("oops wrong answer");
            System.out.println("points scored so far : " + points);
        }

        return points;
    }


}
