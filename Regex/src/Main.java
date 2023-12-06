
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {
        String re = "([a-zA-Z0-9]+)\\.([0-9a-z]+)\\.([0-9a-z]+)\\.([0-9]+)";
        String text = "abcd.135uvqz.7tzik.888";
        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);
        boolean result = mt.matches();
        System.out.println(result);
        while(mt.find()) {
            System.out.println(mt.group(0));
        }
        System.out.println(mt.groupCount());

    }
}