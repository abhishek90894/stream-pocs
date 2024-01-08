package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A111 {

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("AA","BB","CC","AA","BB");

        Map<String,Long> m    =  l1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        m.forEach((word,count)-> System.out.println(word+"  "+count));
    }
}
