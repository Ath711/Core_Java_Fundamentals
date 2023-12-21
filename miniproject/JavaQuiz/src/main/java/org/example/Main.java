package org.example;

import org.example.service.QuestionService;
import org.example.service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        QuestionService questionService = new QuestionService();

        do {
            System.out.println("Enter your role ");
            System.out.println("1.Admin  2.User");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("welcome admin ");
                    questionService.createQuestions();
                    break;

                case 2:
                    System.out.println("welcome user ");
                    System.out.println("There are 5 question each with 1 point ");
                    System.out.println("You have four options, and to score point you have to select the correct option ");
                    System.out.println("Score at least 3 points to win the game ");
                    System.out.println();

                    UserService userService = new UserService(0);
                    int points = userService.playGame();

                    System.out.println();
                    if (points >= 3) {
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