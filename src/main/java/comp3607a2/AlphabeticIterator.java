package comp3607a2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AlphabeticIterator implements SpellingIterator{
    private List<SpellingAttempt> sortedAttempts;
    private int currentAttemptIndex = 0;
    public AlphabeticIterator(List<SpellingAttempt> sortedAttempts) {
        this.sortedAttempts = new ArrayList<SpellingAttempt> (sortedAttempts);
        Collections.sort(this.sortedAttempts, Comparator.comparing(SpellingAttempt::getSpellingWord));
    }
    @Override
    public SpellingAttempt next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }
    @Override
    public Boolean hasNext() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
    }
    @Override
    public int getLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }

}
