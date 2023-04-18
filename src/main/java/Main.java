import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Long.sum;

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
        //Split method seperates from each '##' and puts each product on each line
        //Map out split Lines
        Map<String, List<String>> groupTheLines = Arrays.stream(splitLines)
                .filter(line -> !line.trim().isEmpty())                 // \\t = tab
                .collect(Collectors.groupingBy(line -> line.split("[:\\t]")[1].trim()));
        //Grouped lines,
        for(Map.Entry<String, List<String>> entry : groupTheLines.entrySet()){
            System.out.println(entry.getKey() + ":");
            List<String> productLines = entry.getValue();
            int seenItems = productLines.size();
            //Mapping out the item prices
            Map<String, Integer> itemPriceSeenMap = productLines.stream()
                    .map(line -> line.split("[:\\t]"))
                    .collect(Collectors.groupingBy(arr -> arr[2].trim(),Collectors.summingInt(arr -> 1)
                    ));
            double totalPrice = productLines.stream()
                    .map(line -> line.split("[:\\t]"))
                    .mapToDouble(arr -> Double.parseDouble(arr[4].trim().substring(1)))
                    .sum();
            //Formatting for print
            System.out.println("=============\t\t==============");
            System.out.printf("Price:\t $%.2f\t seen: %d times\n", totalPrice, seenItems);
            System.out.println("-------------\t\t--------------");

            for (Map.Entry<String, Integer> priceEntry : itemPriceSeenMap.entrySet()) {
                String priceStr = priceEntry.getKey();
                int seen = priceEntry.getValue();
                System.out.printf("Price:\t %s\t seen: %d time%s\n", priceStr, seen, seen > 1 ? "s" : "");
            }

            System.out.println();
        }

    }


    //My split method
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

