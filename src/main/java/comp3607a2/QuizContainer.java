package comp3607a2;
/*
 * Name: Varun Maharaj
 * ID: 816036536
 * Course: Object Oriented Programming II
 * Course Code: COMP 3607
 * Assignment: #2
 */
public interface QuizContainer {
    SpellingIterator createAlphabeticalIterator();
    SpellingIterator createCorrectIterator();
    SpellingIterator createDurationIterator();
    SpellingIterator createFluencyIterator();
    SpellingIterator createErrorCorrectionIterator();
}
