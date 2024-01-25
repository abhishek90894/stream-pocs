package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A112 {

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("bhshksrvstve");
        String s = "abhisheksrivastava";
         char[] w   = s.toCharArray();
        System.out.println(w[6]);

      List<String> l2        =  l1.stream().filter(e->e.toLowerCase().matches(".*[aeiou].*")).collect(Collectors.toList());
        System.out.println(l2);

                List<Boolean> l3  =l1.stream().map(e->e.toCharArray().equals('b')).collect(Collectors.toList());
        System.out.println(l3);



    }
}
