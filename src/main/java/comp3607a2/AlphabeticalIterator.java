package comp3607a2;

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
        if (currentAttemptIndex < sortedAttempts.size()) {
            return sortedAttempts.get(++currentAttemptIndex);
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
}
