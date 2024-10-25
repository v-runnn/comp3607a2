package comp3607a2;
/*
 * Name: Varun Maharaj
 * ID: 816036536
 * Course: Object Oriented Programming II
 * Course Code: COMP 3607
 * Assignment: #2
 */
import java.util.List;
import java.util.ArrayList;
public class CorrectIterator implements SpellingIterator{
    private List<SpellingAttempt> correctAttempts;
    private int currentAttemptIndex = 0;
    public CorrectIterator(List<SpellingAttempt> correctAttempts) {
        this.correctAttempts = new ArrayList<SpellingAttempt> (correctAttempts);
        correctAttempts.stream()
            .filter(SpellingAttempt::isCorrect);
    }
    @Override
    public SpellingAttempt next() {
        if(hasNext()){
            return correctAttempts.get(currentAttemptIndex++);
        }
        return null;
    }
    @Override
    public Boolean hasNext() {
        return currentAttemptIndex < correctAttempts.size();
    }
    @Override
    public int getLength() {
        return correctAttempts.size();
    }
    @Override
    public String toString(){
        String result = "#2: By Correct, Alphabetical\nNumber of elements in iteration: "+this.getLength()+"\n"+"\n";
        while(this.hasNext()){
            SpellingAttempt attempt = this.next();
            result += attempt.getSpellingWord() + "\n";
        }
        return(result);
    }
}
