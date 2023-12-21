package org.example.service;

import org.example.utility.Questions;

import java.util.Scanner;

public class UserService {
    private int points;

    public UserService(int points) {
        this.points = points;
    }

    public int playGame(){

        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=5; i++){

            Questions questions = QuestionService.getQuestions(i-1);

            System.out.println("Question "+ i + " is " + questions.getQuestion());
            System.out.println(getOptions(questions));

            System.out.println("Enter you answer in any case and then press enter");
            String answer = sc.nextLine();

            if(answer.equalsIgnoreCase(questions.getAnswer()) || answer.equals("3")) points++;
            else System.out.println("oops wrong answer");
            System.out.println("Total points : " + points);
            System.out.println();
        }

        return points;
    }

    private String getOptions(Questions questions){
        return  "1. " + questions.getOption1() + "\n"+
                "2. " + questions.getOption2() + "\n"+
                "3. " + questions.getAnswer() + "\n"+
                "4. " + questions.getOption3();
    }



}
