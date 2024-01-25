package Jvm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A125 {

    // Write a program using java 8
    //List<String> s=List.of("Jay","Amit","Raj","Ashok","Jayesh");
    //output should be in Map<String,List<String>>,key should be letter "A" and values should be
    //List.of("Amit","Ashok")

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("Jay","Amit","Raj","Ashok","Jayesh");

        Map<Character,List<String>> m  = l1.stream().filter(e->e.toUpperCase().startsWith("A")).collect(Collectors.groupingBy(e->e.charAt(0)));

        System.out.println(m);
    }
}
