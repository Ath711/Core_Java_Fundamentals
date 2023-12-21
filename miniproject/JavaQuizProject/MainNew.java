package JavaQuizProject;
import java.util.Scanner;

import JavaQuizProject.service.Admin;
import JavaQuizProject.service.User;

public class MainNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        Admin admin = new Admin();

        do {
            System.out.println("Enter your role ");
            System.out.println("1.Admin  2.User");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("welcome admin ");
                    admin.createQuestions();
                    admin.createAnswers();
                    admin.createOptions();

                    break;

                case 2:
                    System.out.println("welcome user ");
                    System.out.println("There are 5 question each with 1 point ");
                    System.out.println("You have two options, to get points you have to select the correct one ");
                    System.out.println("Score at least 3 points to win the game ");

                    User user = new User(0,admin);
                    int points = user.playGame();

                    if (points >= 4) {
                        System.out.println("You won the game");
                    } else {
                        System.out.println("Oops try again");
                    }
                    break;

                default:
                    break;
            }
            System.out.println("press y to continue else press any key except y");
            ch = sc.next().charAt(0);
        }
        while(ch=='y' || ch=='Y');
    }
}