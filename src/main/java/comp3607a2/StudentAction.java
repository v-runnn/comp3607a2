package comp3607a2;
/*
 * Name: Varun Maharaj
 * ID: 816036536
 * Course: Object Oriented Programming II
 * Course Code: COMP 3607
 * Assignment: #2
 */

public class StudentAction {
    private String textTyped;
    @SuppressWarnings("unused")
    private String word;
    private String timestamp;
    private String action;

    public StudentAction(String textTyped, String word, String timestamp, String action){
        this.textTyped = textTyped;
        this.word = word;
        java.util.Date time=new java.util.Date(Long.parseLong(timestamp));
        this.timestamp = time.toString();
        this.action = action.trim();
    }
    public String toString(){
        if(textTyped == null)
        return "{"+ timestamp + " "+ action +  " }";
        else
        return "{"+ timestamp + " "+ action + " "+ textTyped + " }";
    }
    public boolean equals(Object obj){
        if(obj instanceof StudentAction){
            return this.timestamp.equals(((StudentAction)obj).timestamp);
        }
        throw new IllegalArgumentException("Not a Student Action object");
    }
    public String getAction(){
        return this.action;
    }
}
