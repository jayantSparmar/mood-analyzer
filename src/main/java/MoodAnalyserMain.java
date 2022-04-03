/**
 * Purpose  -  I am in Any Mood ,message Should Return HAPPY
 * @author  - Jayant Sing Parmar
 * @version - 16.0
 * @since   - 03-04-2022
 */

/**
 * create a class name as MoodAnalyserMain
 */
public class MoodAnalyserMain {
    /**
     * create a constructor ,this is default constructor name as MoodAnalyserMain
     */
    public MoodAnalyserMain() {
    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}


