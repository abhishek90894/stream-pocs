package Jvm;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A114 {

    public static void main(String[] args) {

        String s = "hello"; // count each character in the string
     Map<Character,Long> m1  =   s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                 m1.forEach((character,count)->System.out.println(character+" "+count));


    }
}
