package language.Threads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern patInput = Pattern.compile("^[a-zA-Z_.-]+[0-9]+$");
        Pattern patternToBeMatched = Pattern.compile("[0-9]+");
        Pattern curly = Pattern.compile("\\{(.*?)\\}");
        String p1 = "abcd.135";
        String p2 = "abcd.135uvqz.7tzik.888";
        String p3 = "abcd.135\tuvqz.7\ttzik.888\n";
        String p4 = "{0, 2}, {0, 7}, {1, 3}, {2, 4}";
        Matcher m1 = patInput.matcher(p1);
        Matcher m2 = patternToBeMatched.matcher(p2);
        Matcher m3 = patternToBeMatched.matcher(p3);
        Matcher m4 = curly.matcher(p4);
        System.out.println(m1.matches());
        System.out.println(m2.matches());
        System.out.println(m3.matches());
        while (m2.find()) {
            System.out.println(m2.group());
        }
        while (m3.find()) {
            System.out.println("Begining Index: " + m3.start() + " Last index: " + (m3.end() - 1));
        }
        while (m4.find()) {
            System.out.println(m4.group());
        }
        String text = "Messi does not que for ports.";
        System.out.println(text);
        System.out.println("After p,q,r is removed: " + validate(text));
        text = "We do not really care";
        System.out.println(text);
        System.out.println("After p,q,r is removed: " + validate(text));
        text = "We are cool";
        System.out.println(text);
        System.out.println("After p,q,r is removed: " + validate(text));
        System.out.println(validate1("bbbbbbbbbbbbbbbbbbbb"));
        System.out.println(validate1("Lava"));
    }

    public static String validate(String text) {
        String s = text.replaceAll("(?i)[pqr]", "");
        return text.equals(s) ? "Not found." : s;


    }
    public static boolean validate1(String text){
        return text.matches("^[\\w]+$") ;

    }
}
