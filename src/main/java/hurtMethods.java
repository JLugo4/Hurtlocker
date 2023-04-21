import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class hurtMethods {
//    //Pattern





}
//Stream
//        String[] input = result.split("\\r?\\n");
//        Stream<String> stream = Arrays.stream(input);
//        //applying pattern to Stream
//        stream.filter()
//        //Lambdas to process output
//Trying new method VVVV WILL REPLACE
//String[] splitLines = splitWithoutDotSplit(output, "##");
    //Split method seperates from each '##' and puts each product on each line
    //Map out split Lines
//    Map<String, List<String>> groupTheLines = Arrays.stream(splitLines)
//            .filter(line -> !line.trim().isEmpty())                 // \\t = tab
//            .collect(Collectors.groupingBy(line -> line.split("[:\\t]")[1].trim()));
//Grouped lines,
//        for(Map.Entry<String, List<String>> entry : groupTheLines.entrySet()){
//        System.out.println(entry.getKey() + ":");
//        List<String> productLines = entry.getValue();
//        int seenItems = productLines.size();
//        //Mapping out the item prices
//        Map<String, Integer> itemPriceSeenMap = productLines.stream()
//        .map(line -> line.split("[:\\t]"))
//        .collect(Collectors.groupingBy(arr -> arr[2].trim(),Collectors.summingInt(arr -> 1)
//        ));
//        double totalPrice = productLines.stream()
//        .map(line -> line.split("[:\\t]"))
//        .mapToDouble(arr -> Double.parseDouble(arr[4].trim().substring(1)))
//        .sum();
//        //Formatting for print
//        System.out.println("=============\t\t==============");
//        System.out.printf("Price:\t $%.2f\t seen: %d times\n", totalPrice, seenItems);
//        System.out.println("-------------\t\t--------------");
//
//        for (Map.Entry<String, Integer> priceEntry : itemPriceSeenMap.entrySet()) {
//        String priceStr = priceEntry.getKey();
//        int seen = priceEntry.getValue();
//        System.out.printf("Price:\t %s\t seen: %d time%s\n", priceStr, seen, seen > 1 ? "s" : "");
//        }
//
//        System.out.println();
//        }