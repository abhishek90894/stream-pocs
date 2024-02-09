package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A140 {

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("a","b","a","d","e");

        Map<String,Long> m        =    l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(m);
    }
}
