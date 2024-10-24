package comp3607a2;

import java.util.ArrayList;
import java.util.List;

public class QuizRecord {
    private List<SpellingAttempt> records;
    public QuizRecord(){
        records = new ArrayList<SpellingAttempt>();
    }
    public void addSpellingAttempt(SpellingAttempt attempt){
        if(attempt != null)
            records.add(attempt);
    }
    public String toString(){
        String s = "";
        for(SpellingAttempt a: records){
            s+= a + "\n";
        }
        return s;
    }
    // public void createAlphabeticalIterator(){
        
    // }
    // public void createCorrectIterator(){

    // }
    // public void createDurationIterator(){

    // }
    // public void createFluencyIterator(){

    // }
    // public void createErrorCorrectionIterator(){
        
    // }
}
