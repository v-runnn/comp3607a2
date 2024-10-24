package comp3607a2;

public interface QuizContainer {
    SpellingIterator createAlphabeticalIterator();
    SpellingIterator createCorrectIterator();
    SpellingIterator createDurationIterator();
    SpellingIterator createFluencyIterator();
    SpellingIterator createErrorCorrectionIterator();
}
