package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A107 {

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("AA", "BB", "AA", "CC");
           Map<Character,Long> m1     =    l1.stream().flatMapToInt(String::chars).filter(Character::isLetter)
                            .mapToObj(e->(char)e).collect(Collectors.groupingBy(e->Character.toLowerCase(e), Collectors.counting()));
        System.out.println(m1);


    }
}
