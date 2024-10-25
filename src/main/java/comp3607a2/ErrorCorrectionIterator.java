package comp3607a2;

import java.util.List;
import java.util.Comparator;

public class ErrorCorrectionIterator implements SpellingIterator{
    private List<SpellingAttempt> ecAttempts; //"ec" is meant to stand for error corrected
    private int currentAttemptIndex = 0;
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
    @Override
    public String toString(){
        String result = "#5: By Backspace\n Number of elements in iteration: "+this.getLength()+"\n";
        while(this.hasNext()){
            SpellingAttempt attempt = this.next();
            result += attempt.getSpellingWord()+" "+attempt.getErrorCorrections()+"\n";
        }
        return result;
    }
}
