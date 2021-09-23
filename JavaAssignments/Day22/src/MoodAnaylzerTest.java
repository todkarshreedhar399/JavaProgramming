import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class MoodAnaylzerTest {
    @Test
    public void givenNullMoodShouldReturnHappy()
    {
        MoodAnalyzer moodAnalyser =new MoodAnalyzer(null);
        String mood = null;
        try {
            ExpectedException exceptionRule=ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullMoodShouldThrowException()
    {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExpceptionType.ENTERED_NULL,e.type);
        }
    }

}
