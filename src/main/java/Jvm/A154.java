package Jvm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A154 {

    public static void main(String[] args) {



        List<Character> l1 = Arrays.asList('a','a','b','d','d','e','d','e','e','c');

        Map<Character,Long> map=   l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                  map.entrySet().stream().filter(e->e.getValue()>2).forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
    }
}
