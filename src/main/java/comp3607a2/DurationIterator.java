package comp3607a2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DurationIterator implements SpellingIterator{
    private List<SpellingAttempt> attempts;
    private int currentAttemptIndex = 0;
    public DurationIterator(List<SpellingAttempt> attempts) {
        this.attempts = new ArrayList<SpellingAttempt>(attempts);
        Collections.sort(this.attempts, Comparator.comparing(SpellingAttempt::getDuration));
    }

    @Override
    public SpellingAttempt next() {
        if(currentAttemptIndex < attempts.size()){
            return attempts.get(++currentAttemptIndex);
        }
        return null;
    }

    @Override
    public Boolean hasNext() {
        return currentAttemptIndex<attempts.size();
    }

    @Override
    public int getLength() {
        return attempts.size();
    }
    @Override
    public void printItr() {
        String result = "#3: By Duration\nNumber of elements in iteration: "+this.getLength();
        while (this.hasNext()){
            SpellingAttempt attempt = this.next();
            result+=attempt.getSpellingWord()+" "+attempt.getDuration()+"\n";
        }
        System.out.print(result);
    }
}
