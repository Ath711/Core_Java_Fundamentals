package JavaQuizProject.service;


import java.util.Scanner;

public class Admin {
    private String[] questions = new String[5];
    private String[] answers = new String[5];
    private String[] options = new String[5];

    Scanner sc = new Scanner(System.in);

    public String getQuestions(int index) {
        return questions[index];
    }

    public String getAnswers(int index) {
        return answers[index];
    }

    public String getOptions(int index) {
        return options[index];
    }

    public final void createQuestions(){
        System.out.println("enter all 5 questions one by one ");
        for(int i=0; i<questions.length; i++){
            questions[i] = sc.nextLine();
        }

    }

    public final void createAnswers(){
        System.out.println("enter answers of all 5 questions one by one ");
        for(int i=0; i<questions.length; i++){
            answers[i] = sc.nextLine();
        }
    }

    public final void createOptions(){
        System.out.println("enter option for all 5 questions one by one ");
        for(int i=0; i<questions.length; i++){
            options[i] = sc.nextLine();
        }
    }

    public final void printAll(){
        for(int i=0; i<questions.length; i++){
            System.out.print(questions[i]);
        }
        System.out.println();
        for(int i=0; i<questions.length; i++){
            System.out.print(answers[i]);
        }
        System.out.println();
        for(int i=0; i<questions.length; i++){
            System.out.print(options[i]);
        }
    }
}
