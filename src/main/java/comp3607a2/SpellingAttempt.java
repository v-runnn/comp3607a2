package comp3607a2;
/*
 * Name: Varun Maharaj
 * ID: 816036536
 * Course: Object Oriented Programming II
 * Course Code: COMP 3607
 * Assignment: #2
 */

import java.util.ArrayList;
import java.util.List;

public class SpellingAttempt {
    private String spellingWord;
    private String attemptedSpelling;
    private String duration;
    private boolean correct;
    private String voicePron;
    private List<StudentAction> actions;

    public SpellingAttempt( String spellingWord, String attemptedSpelling, 
                            String duration, boolean correct, String voicePron){
        this.spellingWord = spellingWord;
        this.attemptedSpelling = attemptedSpelling;
        this.duration = duration;
        this.correct = correct;
        this.voicePron = voicePron;
        actions = new ArrayList<StudentAction>();
    }
    public void addStudentAction(StudentAction a){
        actions.add(a);
    }
    public String toString(){
        return "Spelling word: "+ spellingWord + " Duration: "+ duration + " ms  Student Attempt: " + attemptedSpelling + " Correct: "+ correct + " Voice: "+voicePron+ "\n" + getAttempts();
    }
    private String getAttempts(){
        String s = "";
        for(StudentAction a: actions){
            s+= a + "\n";
        }
        return s;
    }
    public String getSpellingWord(){
        return spellingWord;
    }
    public boolean isCorrect(){
        return correct;
    }
    public int getDuration(){
        return Integer.valueOf(this.duration);
    }
    public int getSteps(){
        return this.actions.size();
    }
    public int getErrorCorrections(){
        int numBackspace = 0;
        for (StudentAction a: actions){
            if (a.getAction().equals("Backspace"))
                numBackspace++;
        }
        return numBackspace;
    }
}
