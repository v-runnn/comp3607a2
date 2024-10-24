package comp3607a2;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCorrectIterator'");
    }
    @Override
    public SpellingIterator createDurationIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createDurationIterator'");
    }
    @Override
    public SpellingIterator createFluencyIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createFluencyIterator'");
    }
    @Override
    public SpellingIterator createErrorCorrectionIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createErrorCorrectionIterator'");
    }
}
