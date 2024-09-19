package gr.aueb.cl.ch20.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyApp {


    public static void main(String[] args) {
        String passwd = "login:thanos;pass:123456;";

        // Greedy match - πάει μέχρι το τελευταίο ;
        Pattern patternGreedy = Pattern.compile(".*;");

        // Reluctant - σταματάει στο πρώτο ;
        Pattern patternReluctant = Pattern.compile(".*?;");

        //Matcher matcher = patternGreedy.matcher(passwd);
        Matcher matcher = patternReluctant.matcher(passwd);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }

    }
}
