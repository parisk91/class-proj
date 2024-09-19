package gr.aueb.cl.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordApp {

    public static void main(String[] args) {
        String password = "1axafdz!!!!!aB";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*()-+=])^.{8,}$");
        Matcher matcher = pattern.matcher(password);//ελέγχει αν ικανοποιεί τις παραπάνω συνθήκες και τπο εκτυπώνει αν ισχύει

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
