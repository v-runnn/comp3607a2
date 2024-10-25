package comp3607a2;

import java.util.ArrayList;
import java.util.List;

public class FluencyIterator implements SpellingIterator{
    private List<SpellingAttempt> difficultAttempts = new ArrayList<SpellingAttempt>();
    private int currentAttemptIndex =0;
    public FluencyIterator(List<SpellingAttempt> attempts){
        for (SpellingAttempt attempt : attempts){
            if((attempt.getSteps()/(double)attempt.getSpellingWord().length() < 1.9))
                this.difficultAttempts.add(attempt);
        }   
    }
    @Override
    public SpellingAttempt next() {
        if (hasNext()) {
            return difficultAttempts.get(currentAttemptIndex++);
        }
        return null;
    }
    @Override
    public Boolean hasNext() {
        return currentAttemptIndex < difficultAttempts.size();
    }
    @Override
    public int getLength() {
        return difficultAttempts.size();
    }
    @Override
    public String printItr(){
        String result = "#4: By Fluency\nNumber of elements in iteration: "+this.getLength()+"\n"+"\n";
        while (this.hasNext()){
            SpellingAttempt attempt = this.next();
            result+=attempt.getSpellingWord()+" "+attempt.getSteps()/(double)attempt.getSpellingWord().length()+"\n";
        }
        return(result);
    }
}
