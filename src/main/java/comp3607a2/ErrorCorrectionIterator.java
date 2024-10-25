package comp3607a2;

import java.util.List;
import java.util.Comparator;

public class ErrorCorrectionIterator implements SpellingIterator{
    private List<SpellingAttempt> ecAttempts; //"ec" is meant to stand for error corrected
    private int currentAttemptIndex = 0;
    //TODO : Must implement a way to read backspaces from student input, use it to count the amount of times a backspace was used in order to sort the number of backspaces used per word in descending order.
    public ErrorCorrectionIterator(List<SpellingAttempt> attempts) {
        for(SpellingAttempt attempt : attempts){
            if(attempt.getErrorCorrections() > 0)
                ecAttempts.add(attempt);
        }
        ecAttempts.sort(Comparator.comparingInt(SpellingAttempt::getErrorCorrections).reversed());
    }
    @Override
    public SpellingAttempt next() {
        if(currentAttemptIndex < ecAttempts.size())
            return ecAttempts.get(++currentAttemptIndex);
        return null;
    }
    @Override
    public Boolean hasNext() {
        return currentAttemptIndex < ecAttempts.size();

    }
    @Override
    public int getLength() {
        return ecAttempts.size();
    }
}
