package language.Threads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {


        Pattern patternInput = Pattern.compile("^[a-zA-Z_.-]+[0-9]+$");
        Pattern pattrnInptStrToBeMatched = Pattern.compile("[0-9]+");
        Pattern patternCurly=Pattern.compile("\\{(.*?)\\}");
        String problem1 = "abcd.135";
        String problem2 = "abcd.135uvqz.7tzik.888";
        String problem3 = "abcd.135\tuvqz.7\ttzik.888\n";
        String problem4 = "{0, 2}, {0, 7}, {1, 3}, {2, 4}";
        Matcher Mat1 = patternInput.matcher(problem1);
        Matcher Mat2 = patternInput.matcher("f4.12b");
        Matcher Mat3 = patternInput.matcher("kjisl.22");
        Matcher MatchProblem2 = pattrnInptStrToBeMatched.matcher(problem2);
        Matcher MatchProblem3 = pattrnInptStrToBeMatched.matcher(problem3);
        Matcher MatchProblem4 = patternCurly.matcher(problem4);
        System.out.println(Mat1.matches());
        System.out.println(Mat2.matches());
        System.out.println(Mat3.matches());
        while (MatchProblem2.find()) {
            System.out.println(MatchProblem2.group());
        }

        while (MatchProblem3.find()) {

            System.out.println("start index: "+MatchProblem3.start()+" end index: "+(MatchProblem3.end()-1));
        }

        while (MatchProblem4.find()) {
            System.out.println(MatchProblem4.group());
        }

        String text = "Neymar, and Brazil will disqualify Portugal.";
        System.out.println("Sample: "+text);
        System.out.println("Remove p,q,r characters : "+validate(text));
        text = "Cameroun suprised us.";
        System.out.println("\nSample: "+text);
        System.out.println("Remove p,q,r characters: "+validate(text));
        text = "fixedlist.";
        System.out.println("\nSample: "+text);
        System.out.println("Remove p,q,r characters: "+validate(text));
    }

    public static String validate(String text) {
        String s = text.replaceAll("(?i)[pqr]", "");
        return text.equals(s) ? "Not found." : s;
    }



}
