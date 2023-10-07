import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {

    private static final Pattern pattern = Pattern.compile("\\[(.+)\\]: (.+)");
    
    public static String message(String logLine) {
        Matcher matcher = pattern.matcher(logLine);
        return matcher.find() ? matcher.group(2).trim() : "";
    }

    public static String logLevel(String logLine) {
        Matcher matcher = pattern.matcher(logLine);
        return matcher.find() ? matcher.group(1).toLowerCase() : "";
    }

    public static String reformat(String logLine) {
        return "%s (%s)".formatted(message(logLine), logLevel(logLine));
    }
}
