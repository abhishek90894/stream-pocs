package Jvm;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A124 {

    public static void main(String[] args) {

        String s1 = "abhishek";
           IntStream c = s1.chars();

        Map<Character,Long> m = c.mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(m);
    }
}
