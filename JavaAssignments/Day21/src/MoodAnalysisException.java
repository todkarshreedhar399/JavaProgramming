
public class MoodAnalysisException extends Exception{
    enum ExpceptionType{
        ENTERED_NULL,ENTERED_EMPTY
    }
    ExpceptionType type;
    public MoodAnalysisException(ExpceptionType type,String message)
    {
        super(message);
        this.type=type;
    }

}