package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A153 {

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("listen" , "silent");

         String s1=  "listen";
         String s2 = "silent";

           List<Character>c1        =   s1.chars().mapToObj(e->(char)e).sorted().collect(Collectors.toList());
        List<Character>c2 = s2.chars().mapToObj(e->(char)e).sorted().collect(Collectors.toList());

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));



    }
}
