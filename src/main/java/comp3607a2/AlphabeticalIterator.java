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
import java.util.Collections;
import java.util.Comparator;

public class AlphabeticalIterator implements SpellingIterator{
    private List<SpellingAttempt> sortedAttempts;
    private int currentAttemptIndex = 0;
    public AlphabeticalIterator(List<SpellingAttempt> sortedAttempts) {
        this.sortedAttempts = new ArrayList<SpellingAttempt> (sortedAttempts);
        Collections.sort(this.sortedAttempts, Comparator.comparing(SpellingAttempt::getSpellingWord));
    }
    @Override
    public SpellingAttempt next() {
        if (hasNext()) {
            return sortedAttempts.get(currentAttemptIndex++);
        }
        return null;
    }
    @Override
    public Boolean hasNext() {
        return currentAttemptIndex < sortedAttempts.size();
    }
    @Override
    public int getLength() {
        return sortedAttempts.size();
    }
    @Override
    public String toString(){
        String result = "#1: By Alphabetical\nNumber of elements in iteration: "+this.getLength()+"\n"+"\n";
        while(this.hasNext()){
            SpellingAttempt attempt = this.next();
            result += attempt.getSpellingWord() +"\n";
        }
        return (result);
    }
}
