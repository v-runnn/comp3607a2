package comp3607a2;

import java.util.List;
import java.util.ArrayList;

public class ErrorCorrectionIterator implements SpellingIterator{
    private List<SpellingAttempt> errorCorrectionAttempts;
    private int currentAttemptIndex;
    public ErrorCorrectionIterator(List<SpellingAttempt> errorCorrectionAttempts) {
        this.errorCorrectionAttempts = new ArrayList<SpellingAttempt>(errorCorrectionAttempts);
        //TODO : Must implement a way to read backspaces from student input, use it to count the amount of times a backspace was used in order to sort the number of backspaces used per word in descending order.

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
