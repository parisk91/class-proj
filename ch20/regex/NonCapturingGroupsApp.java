package gr.aueb.cl.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonCapturingGroupsApp {

    public static void main(String[] args) {
        String s = "HelloWorld HelloWorldWorld";

        Pattern pattern = Pattern.compile("(Hello)(?:World)+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println(matcher.group(i) + " ");
            }
            System.out.println();
        }
    }
}
