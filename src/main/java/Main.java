import org.apache.commons.io.IOUtils;
import java.io.IOException;
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


        //Pattern
        String patternString = "##";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(result);
        // Stream
        String[] input = result.split("\\r?\\n");
        Stream<String> stream = Arrays.stream(input);
        //applying pattern to Stream

        //Lambdas to process output
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        System.out.println(output);

    }
}
