package comp3607a2;

import java.util.Iterator;

public interface QuizIteratorAggregate {
    Iterator createAlphabeticalIterator();
    Iterator createCorrectIterator();
    Iterator createDurationIterator();
    Iterator createFluencyIterator();
    Iterator createErrorCorrectionIterator();
}
