package org.launchcode.java.studios.quizard;
//A console program that allows the user to take a quiz.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int total=0;
        //Create some questions

        //CHECKBOX
        //create choices for first question
        ArrayList<String> firstQuestionChoices = new ArrayList<String>();
        firstQuestionChoices.add("Blue");
        firstQuestionChoices.add("Black");
        firstQuestionChoices.add("Green");

        //create answers to first question
        ArrayList<String> firstQuestionAnswer = new ArrayList<String>();
        firstQuestionAnswer.add("Blue");
        firstQuestionAnswer.add("Black");

        Question firstQuestion = new Question("What color is the sky?", firstQuestionChoices ,firstQuestionAnswer, "Checkbox");
        //print first question and choices
        firstQuestion.printDescription();
        firstQuestion.printChoices();
        //Get some input from the user
        //create new scanner
        Scanner in = new Scanner(System.in);
        //Get some input from the user
        System.out.println("Enter number next to correct answer, if more than one correct answer, separate by commas: ");
        String usersInput=in.next();
        //format user input into an arraylist
        ArrayList<String> usersInputFormatted=new ArrayList<String>(Arrays.asList(usersInput.split(",")));

        if(firstQuestion.isCorrect(usersInputFormatted,firstQuestion)){
            System.out.println("You received 1 point for answering this question correctly! ");
            total++;
        }

    }

}

