package Jvm;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A118 {

    public static void main(String[] args) {

        String s = "abhishek";

        Map<Character,Long> map     = s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
               map.forEach((name,count)-> System.out.println(name+" "+count));

    }
}
