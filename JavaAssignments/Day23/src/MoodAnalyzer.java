
public class MoodAnalyzer {
    private String message;
    public String analyseMethod(String message) {
        if (message.contains(("SAD"))) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
    public MoodAnalyzer(String message)
    {
        this.message=message;
    }

    public String analyseMood(String message) throws MoodAnalysisException {
        this.message=message;
        return analyseMood();
    }
    public String analyseMood() throws MoodAnalysisException {
        try {
            if(message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExpceptionType.ENTERED_EMPTY, "Please enter proper name");
            if(message.contains(("SAD")))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExpceptionType.ENTERED_EMPTY,"Please enter proper name");
        }
    }

}
