package org.example.service;

import org.example.utility.Questions;

import java.util.Scanner;

public class QuestionService {

    private static final Questions[] questions = new Questions[5];

    Scanner sc = new Scanner(System.in);

    public static Questions getQuestions(int index) {
        return questions[index];
    }

    public final void createQuestions(){
        for(int i=0; i<questions.length; i++){

            System.out.println("enter your "+ (i+1) + ". question ");
            String quest = sc.nextLine();

            System.out.println("enter your "+ 1 + ". option ");
            String opt1 = sc.nextLine();

            System.out.println("enter your "+ 2 + ". option ");
            String opt2 = sc.nextLine();

            System.out.println("enter your "+ 3 + ". option ");
            String opt3 = sc.nextLine();

            System.out.println("enter the actual answer ");
            String ans = sc.nextLine();

            questions[i] = new Questions(i+1,quest,opt1,opt2,opt3,ans);
        }

    }
}
