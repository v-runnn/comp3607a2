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

public class QuizRecord implements QuizContainer{
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
    public List<SpellingAttempt> getRecords() {
        return records;
    }
    @Override
    public SpellingIterator createAlphabeticalIterator(){
        return new AlphabeticalIterator(records);
    }
    @Override
    public SpellingIterator createCorrectIterator() {
        return new CorrectIterator(records);
    }
    @Override
    public SpellingIterator createDurationIterator() {
        return new DurationIterator(records);
    }
    @Override
    public SpellingIterator createFluencyIterator() {
        return new FluencyIterator(records);
    }
    @Override
    public SpellingIterator createErrorCorrectionIterator() {
        return new ErrorCorrectionIterator(records);
    }
}
