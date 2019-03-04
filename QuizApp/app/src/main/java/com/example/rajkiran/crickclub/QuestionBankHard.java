package com.example.rajkiran.crickclub;

public class QuestionBankHard {


    private String textQuestions [] = {
            "1. Who Won ICC Cricket worldcup in 197666666666666",
            "2. Who Won ICC Cricket worldcup in 1979?",
            "3. Who Won ICC Cricket worldcup in 1983?",
            "4. Who Won ICC Cricket worldcup in 1987?",
            "5. Who Won ICC Cricket worldcup in 1992?",
            "6. Who Won ICC Cricket worldcup in 1996?",
            "7. Who Won ICC Cricket worldcup in 1999?",
            "8. Who Won ICC Cricket worldcup in 2003?",
            "9. Who Won ICC Cricket worldcup in 2007?",
            "10. Who Won ICC Cricket worldcup in 2011?"

    };


    private String multipleChoice [][] = {
            {"Australia", "India", "Africa", "WestIndies"},
            {"Australia", "India", "Africa", "WestIndies"},
            {"Australia", "India", "Africa", "WestIndies"},
            {"Australia", "India", "Africa", "WestIndies"},
            {"Australia", "India", "Pakistan", "WestIndies"},
            {"Australia", "India", "Africa", "WestIndies"},
            {"Australia", "India", "Africa", "WestIndies"},
            {"Australia", "India", "Africa", "WestIndies"},
            {"Australia", "India", "Africa", "WestIndies"},
            {"Australia", "India", "Africa", "WestIndies"},

    };

    private String mCorrectAnswers[] = {"WestIndies", "WestIndies", "India", "Australia", "Pakistan","Australia","Australia","Australia","India", "Australia"};


    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }


    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}