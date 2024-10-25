package comp3607a2;

public interface SpellingIterator {
    SpellingAttempt next();
    Boolean hasNext();
    int getLength();
    void printItr();
}
