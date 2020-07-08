package org.launchcode.java.studios.quizard;


import java.util.ArrayList;

public class Question {

    private String description;
    private ArrayList<String> choices;
    private ArrayList<String> answer;
    private String type;


    public Question(String description,ArrayList<String> choices, ArrayList<String> answer, String type ){
        this.description=description;
        this.choices=choices;
        this.answer=answer;
        this.type=type;
    }

    public void printDescription(){
        System.out.println(description);
    }

    public void printChoices(){
        int count=0;
        for (String choice:choices) {
            count++;
            System.out.println(count + ". " + choice);
        }

    }

    public String getType() {
        return type;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }
    public ArrayList<String> getChoices() {
        return choices;
    }
    public boolean isCorrect(ArrayList<String> userInput, Question questionToCheck){
        //get choices of question
        ArrayList<String> choices=questionToCheck.getChoices();
        //get correct answers
        ArrayList<String> answers=questionToCheck.getAnswer();
        int correctChoices=0;
        if(questionToCheck.getType()=="Checkbox"){
            for (String userAnswer:userInput) {
                for (String answer:answers) {
                    if(choices.get(Integer.parseInt(userAnswer)-1)==answer){
                        correctChoices++;
                        System.out.println("You chose the correct answer "+answer);
                    }
                }

            }
        }
        if(correctChoices==answers.size()){
            return true;
        }
        else {
            return false;
        }
    }
}
