import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    //Group by name
    // Group by price
    // Count how many times seen
    // Count errors
    //Format
    //More detailed steps
    //Created Expression
    // process through streams
    //Apply lambdas to process output

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;

    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        System.out.println(output);
        String[] splitLines = splitWithoutDotSplit(output, "##");

    }
    public static String[] splitWithoutDotSplit(String str, String delimiter) {
        ArrayList<String> subs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - delimiter.length()
                    && str.substring(i, i - delimiter.length()).equals(delimiter)) {
                subs.add(sb.toString());
                i += delimiter.length();
            } else {
                sb.append(str.charAt(i));
            }
        }
        subs.add(sb.toString());
        String[] splitString = new String[subs.size()];
        for (int i = 0; i < subs.size(); i++) {
            splitString[i] = subs.get(i);
        }
        return splitString;
    }
    public static String[] formatString(){


        return null;
    }

}

