package Jvm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class A132 {



    public static void main(String[] args) {

        List<String> s = Arrays.asList("2","12","34","11","5","78");


        List<Integer> sorted =              s.stream().map(e->Integer.valueOf(e)).sorted(Collections.reverseOrder()).collect(Collectors.toList());

       //  List<String> sorted   = s.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

//        String s1 = "hello";
//        String s2 = "hello";
//
//        String s3 = new String("hello");
//
//        System.out.println(s1==s2);  //true
//        System.out.println(s1==s3);   // false
//        System.out.println(s1.equals(s2)); //true
//        System.out.println(s1.equals(s3)); //true
    }
}
